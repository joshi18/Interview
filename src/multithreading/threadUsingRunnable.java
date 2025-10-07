package src.multithreading;

public class threadUsingRunnable implements Runnable{
    @Override
    public void run() {
        // task logic

        for (int i=0;i<10;i++){
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
