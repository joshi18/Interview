package DesignPatterns.StructuralDesignPattern.DecoratorDP;

public class Test {
    public static void main(String[] args) {

         Pizza pizza = new PlainPizza();
        System.out.println(pizza.getprice()); // Base pizza


         PizzaDecorer pizzaDecorer = new CheeseDecorator(pizza);
        System.out.println(pizzaDecorer.getprice()); // Adding cheese over piza changes the price

          PizzaDecorer pizzaDecorer1= new MushroomDecorator(pizza);
        System.out.println(pizzaDecorer1.getprice());  // Adding mushroom over pizza changes the prices
    }
}
