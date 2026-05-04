package com.uv.practice_java.executor;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[15];

        for (int i = 0; i < 15; i++) {
            int finalI = i;
            threads[i] = new Thread(() -> {
                System.out.println("Factorial of " + finalI + " is " + factorial(finalI));
            });
        }

        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            thread.join();
        }
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
