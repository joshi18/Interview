package src.DesignPatterns.StrategeyDesignPattern;

public class Vechicle {

    private DriveStrategy driveStrategy;

//    public Vechicle(DriveStrategy driveStrategy){
//        this.driveStrategy = driveStrategy;
//
//    }

    public void setDrivemethod(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }


    public void drive(){
        driveStrategy.drive();
    }
}
