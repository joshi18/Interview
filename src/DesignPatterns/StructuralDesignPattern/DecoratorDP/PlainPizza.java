package DesignPatterns.StructuralDesignPattern.DecoratorDP;

public class PlainPizza implements Pizza{
    @Override
    public int getprice() {
        return 50;
    }

    @Override
    public void getPizzaName() {
        System.out.println("This is paling Pizza");
    }
}
