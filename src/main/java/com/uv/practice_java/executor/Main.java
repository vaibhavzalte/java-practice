package com.uv.practice_java.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> future = executorService.submit(() -> 1 + 3);
        future.get();
        System.out.println("Result: " + future.get());
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(3);
        scheduler.schedule(() -> System.out.println("Task 1 executed after 2 seconds"), 2, TimeUnit.SECONDS);
        scheduler.scheduleAtFixedRate(() -> System.out.println("Task 2 executed every 3 seconds"), 0, 3, TimeUnit.SECONDS);
        System.out.println("Main thread continues...");
    }

}
