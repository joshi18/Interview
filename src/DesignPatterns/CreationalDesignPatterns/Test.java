package DesignPatterns.CreationalDesignPatterns;


import DesignPatterns.CreationalDesignPatterns.AbstractDesignPattern.AbstactFactory;
import DesignPatterns.CreationalDesignPatterns.AbstractDesignPattern.Profession;
import DesignPatterns.CreationalDesignPatterns.AbstractDesignPattern.TypeOfProfessionFactory;
//import DesignPatterns.CreationalDesignPatterns.FactoryDesign.Profession;
import DesignPatterns.CreationalDesignPatterns.FactoryDesign.ProfessionFactory;

// Why design patterns neede ? => As the design patterns are well documented and structruced solution of existing problem
// so design patterns are also needed to execute the solutions. Tried and testeed soln of exsiogn documted problem.
// Creational design patterns, Means => How to create to an object (Way of creating objects).
// Creational design patterns =>
// 1. Singleton,prototype,builder ,Abstract Factory,Factory
public class Test {
    public static void main(String[] args) {
        // Factory design Pattern
        // Here we have created a ProfessionFactory class and new method which return the instance of the Profession
        // and we are calling with the method of its implementing class.
        ProfessionFactory professionFactory = new ProfessionFactory();
         //Profession profession  = professionFactory.getprofession("Doctor");
         //profession.print();


        // ABSTRACT DESIGN PATTERN (FACTORY OF FACTORY).
         AbstactFactory abstactFactory = TypeOfProfessionFactory.getabstactprofession("MainProfession");
        Profession engg = abstactFactory.getabstactprofession("Doctor");
         engg.print();



    }
}
