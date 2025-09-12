package Miscellaneous;

public class SingletonClassLazy {

    private static  SingletonClassLazy singletonClassLazy;

    private SingletonClassLazy(){

    }

    //here we can use synchronised keyword also for thread safety.
    public static  SingletonClassLazy getSingleTonInstance(){
        if (singletonClassLazy == null){
            singletonClassLazy = new SingletonClassLazy();
        }
        return singletonClassLazy;
    }
}
