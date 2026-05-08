package com.uv.practice_java.executor;

import java.util.concurrent.Callable;

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
    public synchronized void withdraw(int amount){
        System.out.println(Thread.currentThread().getName()+" is going to withdraw amount:- "+amount);
        try {
            if(bankBalance>0){
                Thread.sleep(3000);
                bankBalance-=amount;
                System.out.println(Thread.currentThread().getName() + " withdraw amount:- "+amount);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
