package Misnileousu;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakSingletonClass {



    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        // Using Reflection we can break the singleton class
       // Reflection is a feature in Java that lets you inspect and manipulate classes, methods, fields, and constructors at runtime, even if you don’t know them at compile time.
        Constructor<SingletonClassEagerly> constructor = SingletonClassEagerly.class.getConstructor();
        constructor.setAccessible(true);

        SingletonClassEagerly instance1 = constructor.newInstance();
        SingletonClassEagerly instance2 = constructor.newInstance();

        System.out.println(instance1==instance2);



        ///  using cloneable
        // first we need to implement the cloneable interface in the singleton class.

        SingletonClassEagerly singletonClassEagerly = SingletonClassEagerly.getInstance1();
       // SingletonClassEagerly singletonClassEagerly2 = (SingletonClassEagerly) singletonClassEagerly.clone();


        // using serilization and desrilization

//        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
//        out.writeObject(SingletonClass.getInstance());
//
//        ObjectInputStream in = new ObjectInputStream(new FileInputStream("singleton.ser"));
//        SingletonClass instance2 = (SingletonClass) in.readObject();
//
//        System.out.println(SingletonClass.getInstance() == instance2); // false 🚨



    }


}
