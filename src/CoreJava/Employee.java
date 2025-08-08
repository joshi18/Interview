package CoreJava;

public class Employee {

    int id;
    String name;

    Employee(int id,String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }
    public Employee getclass(){
        return this;
    }

    public boolean equals(Employee e){
        if (e==null && getclass() == e.getclass()){
            return false;
        }
        if (e==this){
            return true;
        }
        Employee e1 =(Employee) e;
        return (this.getId()==e1.getId());

    }
}
