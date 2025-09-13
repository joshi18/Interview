package DesignPatterns.StrategeyDesignPattern;

public class sportsDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("inside sports drive strategy");
    }
}
