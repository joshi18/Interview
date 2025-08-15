package DesignPatterns.StructuralDesignPattern.FlyweightDP;

public class FlyweightMainClass {
    public static void main(String[] args) {
        Shape cirlce = ShapeFacotry.getCicleObject("Red");
        cirlce.draw(10,20);

         Shape cielcel2 = ShapeFacotry.getCicleObject("Redkk");
        cielcel2.draw(20,30);

        System.out.println(cielcel2==cirlce);
    }
}
