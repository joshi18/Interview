package DesignPatterns.StructuralDesignPattern.DecoratorDP;

public abstract class PizzaDecorer implements Pizza{

    protected Pizza pizza;

    public PizzaDecorer(Pizza pizza){
        this.pizza = pizza;

    }
    @Override
    public int getprice() {
        return pizza.getprice();
    }

    @Override
    public void getPizzaName() {
        System.out.println("This is paling Pizza");
    }
}
