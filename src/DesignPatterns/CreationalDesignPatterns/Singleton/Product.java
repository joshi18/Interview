package DesignPatterns.CreationalDesignPatterns.Singleton;


import java.io.Serializable;

// this is basic singleton class . Here we have created product object with  new keyword and it should be private static in nature.
// Make the constructor private
// return the product object with static method
public class Product implements Serializable,Cloneable {

    private static Product product = new Product();

    private Product(){

    }
    public static  Product getInstance(){
        return product;  // Eager Loading
    }
    public  void getHashCode(){
        System.out.println("Equals Method HashCode" + product);
    }

    @Override
    public Product clone() {
        try {
            Product clone = (Product) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
