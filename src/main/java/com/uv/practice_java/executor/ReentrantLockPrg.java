package com.uv.practice_java.executor;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockPrg {
    public static void main(String[] args) {
        Bank sbi = new Bank();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                sbi.withdraw(50);
            }
        };
        Thread thread1 = new Thread(task,"thread-1");
        Thread thread2 = new Thread(task,"thread-2");
        thread1.start();
        thread2.start();
    }

}
class Bank {
    int bankBalance;
    Bank(){
        bankBalance=100;
    }

    Lock lock = new ReentrantLock();
    public void withdraw(int amount){
        System.out.println(Thread.currentThread().getName()+" is going to withdraw amount:- "+amount);
        try {
            if (lock.tryLock(1, TimeUnit.SECONDS)) {
                System.out.println(Thread.currentThread().getName() + " got the lock");
                if (bankBalance >= amount) {
                    try {
                        Thread.sleep(5000);
                        bankBalance -= amount;
                        System.out.println(Thread.currentThread().getName() + " withdraw amount:- " + amount);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    } finally {
                        lock.unlock();
                    }
                }else {
                    System.out.println(Thread.currentThread().getName()+"insufficient balance");
                }
            }
            else{
                System.out.println(Thread.currentThread().getName() + " didn't get lock");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
