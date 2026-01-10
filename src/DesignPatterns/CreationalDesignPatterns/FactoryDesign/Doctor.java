package src.DesignPatterns.CreationalDesignPatterns.FactoryDesign;

public class Doctor implements DesignPatterns.CreationalDesignPatterns.FactoryDesign.Profession {
    @Override
    public void print() {
        System.out.println("Inside the Doctor class");
    }
}
