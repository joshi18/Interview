package src.LLD.SOLID.LiskovPrincipal.Solution;

public class Bicycle extends Bike{
    @Override
    public void applyBreaks() {
        System.out.println("Applying breaks on Bicycle");
    }

    @Override
    public void accelerate() {
        System.out.println("Applying acceleration");

    }
}
