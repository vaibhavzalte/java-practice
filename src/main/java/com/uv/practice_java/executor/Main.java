package com.uv.practice_java.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(3);
        scheduler.scheduleAtFixedRate(() -> System.out.println("Task 1 executed every 3 seconds"), 0, 3, TimeUnit.SECONDS);
        scheduler.schedule(()-> scheduler.shutdown(), 20, TimeUnit.SECONDS);
        scheduler.scheduleWithFixedDelay(() -> System.out.println("Task 2 executed with fixed delay of 5 seconds"), 0, 5, TimeUnit.SECONDS);
        System.out.println("Main thread continues...");
    }

}
