package DesignPatterns.StrategeyDesignPattern;

public class nomalDriveStrategy implements  DriveStrategy{
    @Override
    public void drive() {
        System.out.println("inside nor,mal drive strategy");
    }
}
