package DesignPatterns.CreationalDesignPatterns.PrototypeV2;


// Instead of creating new objects from scratch every time, you clone an existing object (called a prototype).

//When to use:
//
//Object creation is costly (e.g., needs a lot of computation or database calls).
//
//You want to avoid building complex initialization logic multiple times.
//
//You want to keep object creation logic in one place.


//Key points
//
//You define a clone() method (in Java usually via Cloneable interface or custom method).
//
//A Prototype Registry can store pre-built prototypes for cloning.
//
//This avoids repeatedly running expensive constructors.


public class PrototypeMainClass {

    public static void main(String[] args) {
        PrototypeRegistraty prototypeRegistraty = new PrototypeRegistraty();
        prototypeRegistraty.addPrototype("square",new Square(5));
        prototypeRegistraty.addPrototype("rectangle",new Rectangle(2,3));

       Square square = (Square) prototypeRegistraty.getPrototype("square");
       Rectangle rectangle = (Rectangle) prototypeRegistraty.getPrototype("rectangle");
    }
}
