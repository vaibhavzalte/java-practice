package com.uv.practice_java.executor;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockExample {
    public static void main(String[] args) {
    Resource resource = new Resource();
    Runnable readerTask = new Runnable() {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                resource.getValue();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    };
    Runnable writerTask = resource::increment;
    Thread reader1 = new Thread(readerTask,"reader1");
    Thread reader2 = new Thread(readerTask,"reader2");
    Thread reader3 = new Thread(readerTask,"reader3");
    Thread writer = new Thread(writerTask,"writer");
    writer.start();
    reader1.start();
    reader2.start();
    reader3.start();
    }
}
class Resource {
    private int value=0;
    private final ReentrantReadWriteLock lock= new ReentrantReadWriteLock();
    private Lock readLock= lock.readLock();
    private Lock writeLock= lock.writeLock();
    public void getValue() {
        readLock.lock();
        try{
            System.out.println("Value read: " + value + " by " + Thread.currentThread().getName());
        }
        finally {
            readLock.unlock();
        }
    }

    public void increment() {
        writeLock.lock();
        try{
            value++;
            System.out.println("Value incremented to: " + value+ " by " + Thread.currentThread().getName());
        }
        finally {
            writeLock.unlock();
        }
    }
}
