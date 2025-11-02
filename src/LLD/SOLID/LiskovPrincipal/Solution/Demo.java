package src.LLD.SOLID.LiskovPrincipal.Solution;

public class Demo {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.accelerate();
        bicycle.applyBreaks();

        MotorCycle motorCycle = new MotorCycle();
        motorCycle.accelerate();
        motorCycle.turnOfEngine();
        motorCycle.turnOnEngine();


        // here we have created a new interface which has different functionality. i.e Engine Functionality
        // Put only generic methods in the abstract Bike class.



    }
}
