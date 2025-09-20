package src.multithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecuatorFramework {


    public static void main(String[] args) throws InterruptedException {
        long starttime = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 1; i < 10; i++) {
            int finalI = i;
            executor.submit(() ->
            {
                long result = 0;
                try {
                    result = factorial(finalI);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(result);
            });

        }
        executor.shutdown();
       // executor.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println("total time taken for fatorial mehtods" + (System.currentTimeMillis() - starttime));

    }

    public static int factorial(int n) throws InterruptedException {
        Thread.sleep(1000);
        int fact = 1;
        return fact * 1000;

    }
}
