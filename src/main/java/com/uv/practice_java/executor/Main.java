package com.uv.practice_java.executor;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
//       CountDownLatch example
        int numberOfThreads = 3;
        CyclicBarrier barrier = new CyclicBarrier(numberOfThreads);
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfThreads);

        Future<String> future1 = executorService.submit(new DependantService2(barrier));
        Future<String> future2 = executorService.submit(new DependantService(barrier));
        Future<String> future3 = executorService.submit(new DependantService(barrier));

        System.out.println("Main Thread");
        executorService.shutdown();
    }

}
class DependantService implements Callable<String>{
    final CyclicBarrier barrier;
    public DependantService(CyclicBarrier barrier) {
        System.out.println("latch value in constructor: " + barrier.getNumberWaiting());
        this.barrier = barrier;
    }
    public String call() throws BrokenBarrierException, InterruptedException {
            System.out.println(Thread.currentThread().getName()+":=> service started");
            Thread.sleep(1000);
            barrier.await();
        return "DependantService Result";
    }
}
class DependantService2 implements Callable<String>{
    final CyclicBarrier barrier;
    public DependantService2(CyclicBarrier barrier) {
        System.out.println("latch value in constructor: " + barrier.getNumberWaiting());
        this.barrier = barrier;
    }
    public String call() throws BrokenBarrierException, InterruptedException {
            System.out.println(Thread.currentThread().getName()+" server 2 service started");
            Thread.sleep(5000);
            barrier.await();
        return "DependantService Result";
    }
}