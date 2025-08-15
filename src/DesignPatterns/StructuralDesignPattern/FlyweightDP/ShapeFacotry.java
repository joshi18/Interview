package DesignPatterns.StructuralDesignPattern.FlyweightDP;

import java.util.HashMap;
import java.util.Map;

//Intrinsic State: Color & radius (shared, stored in factory).
//
//Extrinsic State: Position (x, y), provided at runtime.
//
//Benefit: If you have millions of similar objects, memory usage drops drastically.
//
//Drawback: Slight complexity in managing extrinsic state.




public class ShapeFacotry {

    public static Map<String,Shape> hashMap = new HashMap<>();

    public static  Shape getCicleObject(String color){
        Shape  circle = hashMap.get(color);
        if (circle == null) {
           circle = new Circle(10,color);
           hashMap.put(color,circle);
            System.out.println("Created New circle object");
        };
        return circle ;

    }
}
