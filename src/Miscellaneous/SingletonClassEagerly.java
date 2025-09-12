package Miscellaneous;

public class SingletonClassEagerly {


   // Eagerly Initialized
    //private static final means it can be created only once
    private  final static SingletonClassEagerly instance1 = new SingletonClassEagerly();


    // private constructor bccause it can not reaccessed from outside the class
    private  SingletonClassEagerly(){
//        if(instance1!=null){
//            throw  new RuntimeException("use the getinstance method");
//        }

        // optional one


    }

    // created a static method because we can call it using class.
    public static  SingletonClassEagerly getInstance1(){
        return instance1;
    }
}
