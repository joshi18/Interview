package src.multithreading.printEvenandOddNumbers;

public class SimpleMain {
    public static void main(String[] args) throws InterruptedException {

        printer printer = new printer();

        Thread thread1= new Thread(()-> {
            try {
                printer.printOddNumbers();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },"Odd thread");
        Thread thread2 = new Thread( ()-> {
            try {
                printer.printEvenNumbers();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },"even thread");

        thread1.start();
        thread2.start();
    }
}
