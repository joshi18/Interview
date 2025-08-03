package multithreading;

public class SimpleThread  extends Thread{

    @Override
    public void run() {
        while(true) {
            System.out.println("Abhijit Here");
        }

    }

    public static void main(String[] args) throws InterruptedException {

        SimpleThread t1 = new SimpleThread();
        t1.setDaemon(true);
        t1.start();
        //t1.join(); /// main wait for t1 thread to complete.
        System.out.println("main  thread completed");

    }
}
