package com.uv.practice_java.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
            ExecutorService executorService = Executors.newFixedThreadPool(2);
        List<Callable<String>> tasks = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int taskId = i;
           tasks.add(()->{
               Thread.sleep(2000);
               System.out.println("Task Completed: " + taskId);
               return "Task " + taskId + " completed";
           });
        }
        List<Future<String>> futures = executorService.invokeAll(tasks,3, TimeUnit.SECONDS);
        System.out.println("futures"+futures.get(0).isCancelled());
        System.out.println("futures"+futures.get(4).isCancelled());
         executorService.shutdown();
        System.out.println("Main thread finished");
    }
}
