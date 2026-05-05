package com.uv.practice_java.executor;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//       CountDownLatch example
        int numberOfThreads = 3;
        CountDownLatch latch = new CountDownLatch(numberOfThreads);
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfThreads);

        Future<String> future1 = executorService.submit(new DependantService(latch));
        Future<String> future2 = executorService.submit(new DependantService(latch));
        Future<String> future3 = executorService.submit(new DependantService(latch));


//        executorService.awaitTermination(3, TimeUnit.SECONDS);
        latch.await();
//        latch.await(1, TimeUnit.SECONDS);
        System.out.println("Main Thread");
        executorService.shutdown();
    }

}
class DependantService implements Callable<String>{
    final CountDownLatch latch;
    public DependantService(CountDownLatch latch) {
        System.out.println("latch value in constructor: " + latch.getCount());
        this.latch = latch;
    }
    public String call() {
        try {
            Thread.sleep(2000);
            System.out.println("DependantService is running...");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            latch.countDown();
        }
        return "DependantService Result";
    }
}