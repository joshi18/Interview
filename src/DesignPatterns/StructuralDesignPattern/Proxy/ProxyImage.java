package DesignPatterns.StructuralDesignPattern.Proxy;

public class ProxyImage implements Image{


    private RealImage realImage;
    String FileName;

    public ProxyImage(String fileName){
        this.FileName = fileName;
    }


    @Override
    public void diplay() {
        if (realImage==null){
            realImage = new RealImage(FileName); // Lazy Initilization (Objec is created when it is needed )
        }
        System.out.println("Image is from proxy server");
        realImage.diplay();
    }
}
