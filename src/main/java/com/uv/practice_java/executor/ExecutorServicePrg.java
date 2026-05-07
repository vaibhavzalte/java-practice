package com.uv.practice_java.executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServicePrg {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.execute(() -> {
            System.out.println("Thread Name: " + Thread.currentThread().getName());
        });
        Future<String> future = executorService.submit(() -> {
            System.out.println("Thread Name: " + Thread.currentThread().getName());
            return "Task Completed";
        });
        System.out.println(future.get());
        System.out.println(future.isDone());
        executorService.shutdown();
        System.out.println("Main thread");

    }
}
