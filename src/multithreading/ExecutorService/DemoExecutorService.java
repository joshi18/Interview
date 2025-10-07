package src.multithreading.ExecutorService;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DemoExecutorService {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
       java.util.concurrent.Future<Integer> abc  = executorService.submit(()-> 5+10);  // runnable
       Future<?> nmk =  executorService.submit(()-> System.out.println("Thread two are running"));  // callable

        System.out.println(abc.get());
        System.out.println(nmk.get());

        executorService.shutdown();
    }
}
