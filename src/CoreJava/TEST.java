package CoreJava;

import java.util.Optional;
import java.util.concurrent.Callable;

public class TEST {

    public static void main(String[] args) {
        CoreJava.ParentClass pa = new CoreJava.ChildClass();
        pa.getMessageOnTime();//  if the  override methods are static(both child and parent class methods) then reference variables method gets executed
    }

    // But in case of normal method overriding the  class with new keyword which is created is executed.
    // in this example if methods are not static then child class method will get executed.


}
