package com.uv.practice_java.executor;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[2];
        ExecutorService executor = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 5; i++) {
            int taskId = i;
            executor.submit(() -> {
                try {
                    System.out.println("Started " + taskId);
                    Thread.sleep(5000);
                    System.out.println("Finished " + taskId);
                } catch (InterruptedException e) {
                    System.out.println("Interrupted " + taskId);
                }
            });
        }
        executor.shutdownNow();
//        executor.shutdown();
        executor.awaitTermination(3, TimeUnit.SECONDS);
        System.out.println("Main thread finished");
    }
}
