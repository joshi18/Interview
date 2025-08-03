package multithreading;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class SimpleExecutorService {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<?> future = executorService.submit(() -> 42);
        System.out.println(future.get());
        // future.get() will wait the get the result from excutor sercive method.
        Callable<Integer> abc = () -> 42;// it return the value and it is functional interface so we can use the lambda expression java.util.concurrent pakage
        //Runnable abcd = ()-> "abhijit"; // it returns void and it also a functionl inteface. lambda expression can be used.
        Callable<Integer> c1 = ()-> 100;
        Callable<Integer> c2 = () -> 200;
        Callable <Integer> c3 = () -> 300;
        List<Callable<Integer>> abcdf  = Arrays.asList(c1,c2,c3);
        executorService.invokeAll(abcdf);
        // invoke all method wait for   all the  user threads  to complete.// just like join and get methods



    }
}
