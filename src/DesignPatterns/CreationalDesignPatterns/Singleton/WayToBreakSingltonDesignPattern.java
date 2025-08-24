package DesignPatterns.CreationalDesignPatterns.Singleton;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WayToBreakSingltonDesignPattern {

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException {

        Product product = Product.getInstance();
        Product product1 = Product.getInstance();

        System.out.println("First HashCode" + product.hashCode());
        System.out.println("Second HashCode" + product1.hashCode());

        // Reflection

        // First we will fetch the class
        // then will fetch the constructor using getDeclaredConstructor()
        // now set constructor accessible to true.
        // Create a new instance with help of constructor
        // print  the hashcode (It will be different)
        //Class<?> product2 = Class.forName("DesignPatterns.Creational DesignPatterns.Singleton");
        //Constructor<Product> constructor =  (Constructor<Product>) product2.getDeclaredConstructors();
        // constructor.setAccessible(true);

        //Product product3 = constructor.newInstance();
        //System.out.println("Hashcode with  dew pattern"+ product3.hashCode());


        //2nd way
        //Using serialization and Deserialization

        // Serialization
        //  ObjectOutputStream is used for writing on the location and the closing
//        ObjectOutputStream objectOutputStream= new ObjectOutputStream(new FileOutputStream("c://Documtes/Abhijit"));
//        objectOutputStream.writeObject(product1);
//        objectOutputStream.close();


        // Deserialization
        //ObjectOutputStream inputStream = new ObjectOutputStream(new FileOutputStream("c://Documtes/Abhijit"));
        //Product product4 = inputStream.readObject();

        //System.out.println("new Hashcode"+product4.hashCode());


        // Using clone method
        Product brokeninstance = product1.clone();
        System.out.println("broken singloton using clone method" + brokeninstance.hashCode());




//
//        List<Integer> arr = Arrays.asList(1,2,3,4,5,6,7,8);
//        arr.sort();
//        arr.
//        List<Integer> arr1 = new ArrayList<>();
//        int i=0;
//        int j = arr.toArray().length;
//        while(i<=j){
//            arr1.add(arr[i]);
//            arr1.add(arr[j]);
//            arr.remove(arr[i]);
//            arr.remove(arr[j]);
//            i+=1;
//            j-=1;
//
//        }
//        System.out.println(arr1);
//        System.out.println(arr);


    }
}
