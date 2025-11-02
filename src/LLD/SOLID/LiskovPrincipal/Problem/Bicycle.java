package src.LLD.SOLID.LiskovPrincipal.Problem;

public class Bicycle implements Bike{
    @Override
    public void turnOnEngine() {
        throw new AssertionError(" Bicycle has not engine");
    }

    @Override
    public void turnOfEngine() {
        throw new AssertionError("bicycle has not engine");

    }

    @Override
    public void acerlaterateate() {
        System.out.println("Acceralting the bicycle");

    }

    @Override
    public void applyBreaks() {
        System.out.println("decelating bicycle");

    }
}
