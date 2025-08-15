package DesignPatterns.CreationalDesignPatterns.Singleton;

public class Product {

    private static Product product = new Product();

    private Product(){

    }
    public static  Product getInstance(){
        return product;  // Eager Loading
    }
    public  void getHashCode(){
        System.out.println("Equals Method HashCode" + product);
    }
}
