package DesignPatterns.StructuralDesignPattern.FlyweightDP;

public class Circle implements Shape{


    int radius;  //intrinsic variables (Shared)
    String  colour;  //intrinsic variables (Shared)

    public Circle(int radius,String colour){
        this.colour = colour;
        this.radius = radius;
    }
    @Override
    public void draw(int x, int y) {
        System.out.println("printing the circle");
    }
}
