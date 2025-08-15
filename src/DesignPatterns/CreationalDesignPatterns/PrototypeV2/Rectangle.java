package DesignPatterns.CreationalDesignPatterns.PrototypeV2;

public class Rectangle implements Prototype{


    int width;
    int height;

    public Rectangle(int width,int height){
        this.height= height;
        this.width = width;

    }


    @Override
    public Prototype clone() {
       return new Rectangle(width, height);
    }
}
