package DesignPatterns.StructuralDesignPattern.DecoratorDP;

public class MushroomDecorator extends PizzaDecorer{
    public MushroomDecorator(Pizza pizza) {
        super(pizza);
    }
    @Override
    public int getprice() {
        return pizza.getprice()+200;
    }

    @Override
    public void getPizzaName() {
        System.out.println("This is Mushroom Pizza");
    }
}
