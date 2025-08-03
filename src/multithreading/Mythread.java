package multithreading;

public class Mythread extends Thread{

    private counter counter;

    public Mythread(counter counter1){
        this.counter = counter1;
    }

    @Override
    public void run() {
        for (int i =0;i<100;i++){
            counter.incerment();
        }

    }
}
