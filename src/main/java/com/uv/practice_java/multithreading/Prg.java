package com.uv.practice_java.multithreading;

public class Prg extends Thread {
    @Override
    public void run() {
        try {
            System.out.println(getName() + " started");
            Thread.sleep(5000);
            System.out.println(getName() + " completed");

        } catch (InterruptedException e) {

            System.out.println(getName() + " interrupted");
            Thread.currentThread().interrupt(); // restore status
        }

        System.out.println("Interrupted status: "
                + Thread.currentThread().isInterrupted());
    }
    public static void main(String[] args) throws InterruptedException {
        Prg t1 = new Prg();

        t1.start();
//        t1.interrupt();
      Thread t2 = new Thread();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("main thread completed");

    }
}
class MyThread extends Thread {
    @Override
    public void run(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+ " is running...");
    }
}