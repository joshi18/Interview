package src.Miscellaneous.Inheritance;

public class ChildClassNew  extends  ParentClassNew{


    private  String childName;
    private  String FathersName;
    private String Mothername;
    private  int age;

    public ChildClassNew(String childName, String fathersName,String Mothername,String name, String address,String gender,int age){
        super(name,address,gender,age);
        this.childName = childName;
        this.FathersName = fathersName;
        this.Mothername = Mothername;
        this.age = age;

    }

    public  static  String getName(){
        ChildClassNew childClassNew = new ChildClassNew("ahh ","okBye","Nahi","HMM","NAHI","MALE",30);
        System.out.println("Inside the child class get Name");
        return childClassNew.childName;

    }
    public int getAge(){
        System.out.println("Inside the child Class");
        return  age;
    }


}
