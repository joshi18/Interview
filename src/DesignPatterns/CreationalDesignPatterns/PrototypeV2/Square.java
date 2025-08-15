package DesignPatterns.CreationalDesignPatterns.PrototypeV2;

public class Square implements Prototype{



    public  int height;

    public Square(int height){
        this.height = height;
    }

    @Override
    public Prototype clone() {
       return new Square(height);
    }

    public void draw(){
        System.out.println("Square side Printed"+ height);
    }
}
