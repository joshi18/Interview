package DesignPatterns.StructuralDesignPattern.Proxy;



//A proxy acts as a stand-in (substitute) for another object to control access to it.
//
//        Uses:
//
//Lazy initialization (load object only when needed)
//
//Access control (check permissions before allowing calls)
//
//Remote proxy (represent an object in another JVM or system)
//
//Logging / caching / performance monitoring



public class Test {

    public static void main(String[] args) {
        Image image= new RealImage("Abhijit");
        image.diplay();

        image.diplay();
    }

}
