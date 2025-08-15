package DesignPatterns.CreationalDesignPatterns.Prototype;

public abstract class  Profession {


    public  int id;
    public String name;

    abstract void print();

    public Object getClonedObject(){
        Object clone = null;
        try{
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return clone;
    }


}
