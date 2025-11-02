package src.LLD.SOLID.LiskovPrincipal.Problem;

public class MotorCycle implements  Bike{

//    String companyName;
//    String bikeName;
//
//    public MotorCycle(String companyName,String bikeName){
//        this.bikeName = bikeName;
//        this.companyName = companyName;
//
//    }
    @Override
    public void turnOnEngine() {
        System.out.println("MotorCycle engine  Has Stated ");

    }

    @Override
    public void turnOfEngine() {
        System.out.println("MotorCycle Engine Has terned Off");

    }

    @Override
    public void acerlaterateate() {
        System.out.println("Acceleatring the MotorCyle");

    }

    @Override
    public void applyBreaks() {
        System.out.println("Applying Breaks On MotorCycle");

    }
}
