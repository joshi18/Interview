package src.multithreading.printEvenandOddNumbers;

public class printer {

    int Max = 10;


    public synchronized  void printOddNumbers() throws InterruptedException {
        for (int i=0;i<Max;i++){
            if (i%2==0){
                wait();

            }
            System.out.println("Odd Number"+i);
            notify();
        }

    }
    public synchronized  void printEvenNumbers() throws InterruptedException {
        for (int i= 0;i<Max;i++){
            if (i%2!=0){
                wait();

            }
            System.out.println("even Number"+i);
            notify();
        }
    }


}
