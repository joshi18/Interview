package src.multithreading;

public class RunClass {
    public static void main(String[] args) throws InterruptedException {
        java.lang.Runnable task  = new threadUsingRunnable();


        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread1.join(1);
        thread2.start();
        thread2.join(1);
        System.out.println("Thread are running ");
    }
}
