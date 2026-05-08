package com.uv.practice_java.executor;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RenentrantLockExample {
    public static void main(String[] args) {
        Task task = new Task();
        Thread thread1 = new Thread(()->task.outerMethod(),"thread-1");
        Thread thread2 = new Thread(()->task.outerMethod(),"thread-2");
        thread1.start();
        thread2.start();
    }
}

class Task {
   private final Lock lock = new ReentrantLock();

    public void outerMethod() {
        lock.lock();
        try {
            System.out.println("Inside outer method " + Thread.currentThread().getName());
            innerMethodA();
            innerMethodB();
        } finally {
            lock.unlock();
        }
    }

    public void innerMethodA() {
        lock.lock();
        try {
            System.out.println("Inside Inner Method A "+ Thread.currentThread().getName());
        } finally {
            lock.unlock();
        }
    }

    public void innerMethodB() {
        lock.lock();
        try {
            System.out.println("Inside Inner Method B "+ Thread.currentThread().getName());
        } finally {
            lock.unlock();
        }
    }
}
