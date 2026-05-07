package com.uv.practice_java.executor;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ExecutorPrg {
    public static void main(String[] args) {
        Executor executor = Executors.newFixedThreadPool(3);
        executor.execute(() -> {
            System.out.println("Thread Name: " + Thread.currentThread().getName());
        });
        executor.execute(() -> {
            System.out.println("Thread Name: " + Thread.currentThread().getName());
        });
        executor.execute(() -> {
            System.out.println("Thread Name: " + Thread.currentThread().getName());
        });
        executor.execute(() -> {
            System.out.println("Thread Name: " + Thread.currentThread().getName());
        });

    }
}
