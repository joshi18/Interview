package src.LLD.SOLID.LiskovPrincipal.Solution;

public class MotorCycle extends Bike implements Engine{
    @Override
    public void applyBreaks() {
        System.out.println("Applying breaks on MotorCycle");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating the MotorCyle");

    }

    @Override
    public void turnOnEngine() {
        System.out.println("started the Engine");

    }

    @Override
    public void turnOfEngine() {
        System.out.println("Turned Of the Engine");

    }
}
