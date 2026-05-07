package com.uv.practice_java.multithreading;

import java.util.List;

public class ThreadCommunication {
    public static void   main(String[] args) {
        Object lock = new Object();
       Runnable r = () ->{
           System.out.println("step-1 : "+Thread.currentThread().getName());
           synchronized (lock){
               try {
                   Thread.sleep(2000);
               System.out.println("step-2 : critical section : "+Thread.currentThread().getName());
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
           System.out.println("step-3 : "+Thread.currentThread().getName());
       };
       Thread t1 = new Thread(r);
       Thread t2 = new Thread(r);
       Thread t3 = new Thread(r);
       t1.start();
         t2.start();
            t3.start();
}
}
