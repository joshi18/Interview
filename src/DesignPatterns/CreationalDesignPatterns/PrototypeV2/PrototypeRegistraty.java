package DesignPatterns.CreationalDesignPatterns.PrototypeV2;

import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistraty {

    Map<String,Prototype> abc = new HashMap<>();
    public void addPrototype(String key,Prototype prototype){
        abc.put(key, prototype);
    }

    public Prototype getPrototype(String key){
        Prototype prototype= abc.get(key);
        return  (prototype!= null)? prototype.clone() : null;
    }
}
