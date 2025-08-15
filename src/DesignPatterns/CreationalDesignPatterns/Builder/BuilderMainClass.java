package DesignPatterns.CreationalDesignPatterns.Builder;

//Category: Creational pattern
//
//Purpose: Separates the construction of a complex object from its representation so the same construction process can create different representations.
//
//When to use: When an object has many optional parameters or needs step-by-step construction.
//




public class BuilderMainClass {

    public static void main(String[] args) {


        HttpRequest request = new HttpRequest.HttpRequestBuilder("Abhijit/Joshi","Post")
                .clientId(1010)
                .token("bearer 0103jdf")
                .apikey("ansjdnewifjoijv")
                .build();
    }
}
