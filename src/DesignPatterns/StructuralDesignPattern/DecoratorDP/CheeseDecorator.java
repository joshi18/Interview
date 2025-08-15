package DesignPatterns.StructuralDesignPattern.DecoratorDP;

public class CheeseDecorator extends  PizzaDecorer{
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int getprice() {
        return pizza.getprice()+100;
    }

    @Override
    public void getPizzaName() {
        System.out.println("This is Cheese decorator Pizza");
    }

}
