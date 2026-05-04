package com.uv.practice_java.executor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[2];
        ExecutorService executor = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 5; i++) {
            int taskId = i;
            executor.submit(() -> {
                try {
                    System.out.println("Started " + taskId);
                    Thread.sleep(3000);
                    System.out.println("Finished " + taskId);
                } catch (InterruptedException e) {
                    System.out.println("Interrupted " + taskId);
                }
            });
        }
        Thread.sleep(5000);
//        executor.shutdown();
        executor.shutdownNow();
        System.out.println("Main thread finished");
    }
}
