package com.uv.practice_java.executor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[15];
        Executor executorService = Executors.newFixedThreadPool(15);

        for (int i = 0; i < 15; i++) {
            int finalI = i;
            executorService.execute(() -> {
                System.out.println("Factorial of " + finalI + " is " + factorial(finalI));
            });
        }
        System.out.println("All tasks submitted. - it will print first");
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
