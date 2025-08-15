package DesignPatterns.StructuralDesignPattern.Proxy;

public class RealImage implements Image {

    String fileName;
    public RealImage(String fileName){
        this.fileName = fileName;
        loadingfromDisk();
    }
    @Override
    public void diplay() {
        System.out.println("Image"+ fileName);
    }


    public void  loadingfromDisk(){
        System.out.println("Image Loading");  // only one time it is created.

    }
}
