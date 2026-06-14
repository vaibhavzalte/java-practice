package com.uv.practice_java.multithreading;

import lombok.SneakyThrows;

public class Practice1CreatingThread extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) throws InterruptedException {
        Practice1CreatingThread thread1 = new Practice1CreatingThread();
        Practice1CreatingThread thread2 = new Practice1CreatingThread();
        thread1.start();
        thread2.start();
        MyThread2 myThread2 = new MyThread2();
        Thread thread3 = new Thread(myThread2);
        thread3.start();
        thread3.join();
        System.out.println("Main thread is running: " + Thread.currentThread().getName());
    }
}
class MyThread2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }
}
