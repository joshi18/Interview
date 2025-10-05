package src.Miscellaneous.Inheritance;

public class ParentClassNew {

    private  String name;
    private  String address;
    private String gender;
    private int age;


    public ParentClassNew(String name, String address,String gender,int age){
        this.address = address;
        this.gender = gender;
        this.name = name;
        this.age = age;

    }


    public static String  getName(){
        ParentClassNew parentClassNew = new ParentClassNew("abhijit","kkl","MALE",80);
        System.out.println("Inside the parent class getName");
        return parentClassNew.name;
    }

    public  String getAddress(){
        return  address;
    }
     public int getAge(){
         System.out.println("Inside the Parent class");
        return  age;
     }


     public static void staticMathod(){
         System.out.println("inside the Parent static method ");
     }


}
