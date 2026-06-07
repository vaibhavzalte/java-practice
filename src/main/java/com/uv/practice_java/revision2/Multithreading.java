package com.uv.practice_java.revision2;

import java.util.concurrent.*;

public class Multithreading {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Callable<String> task = () -> "hi " + Thread.currentThread().getName();
        Future<String> submit = executorService.submit(task);
        System.out.println(submit.get());
        System.out.println(executorService.submit(task).get());
        System.out.println(executorService.submit(task).get());
        System.out.println(executorService.submit(task).get());
        executorService.shutdown();
    }
}
