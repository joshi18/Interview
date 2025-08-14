package DesignPatterns.CreationalDesignPatterns.FactoryDesign;

public class Doctor implements Profession{
    @Override
    public void print() {
        System.out.println("Inside the Doctor class");
    }
}
