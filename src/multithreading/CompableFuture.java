package multithreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompableFuture {

    // CompletableFuture => it can be used for async call.i.e main thread will wait for this asnc call
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> n = CompletableFuture.supplyAsync(() ->
        {
            try {
                Thread.sleep(1000);
                System.out.println("daemon thread trying to execuute");
                return "OK";
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
       // System.out.println(n.get());
        Thread.sleep(1000);
        System.out.println("MAIN thread executed");

    }
}
