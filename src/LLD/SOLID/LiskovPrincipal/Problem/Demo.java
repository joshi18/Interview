package src.LLD.SOLID.LiskovPrincipal.Problem;

public class Demo {
    public static void main(String[] args) {

        MotorCycle motorCycle = new MotorCycle();
        motorCycle.acerlaterateate();
        motorCycle.turnOfEngine();
        motorCycle.turnOnEngine();

        Bicycle bicycle = new Bicycle();
        bicycle.turnOnEngine(); // here it violates the principal. Bicycle has not engine then how engine has stared.
        bicycle.turnOfEngine();

        // here we are trying to access the feature which bicycle has not. Forcing to implement this feature.


    }
}
