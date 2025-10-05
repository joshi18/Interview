package src.Miscellaneous.Inheritance;

public class TestInheritance {
    public static void main(String[] args) {
        ChildClassNew childClassNew = new ChildClassNew("ahh ","okBye","Nahi","HMM","NAHI","MALE",30);
        System.out.println(childClassNew.getAge());
        ParentClassNew parentClassNew = new ChildClassNew("ahh ","okBye","Nahi","HMM","NAHI","MALE",30);
        System.out.println(parentClassNew.getAge());

        //The object’s actual type (not the reference type) decides which overridden method will run.
        ParentClassNew parentClassNew1 = new ParentClassNew("dkdk","pkljjj","MALE",99);
        System.out.println(parentClassNew1.getAge());

        parentClassNew1.getName();
        parentClassNew.getName();

        ParentClassNew.getName();
        ChildClassNew.getName();


        ChildClassNew.staticMathod(); // static method can be accessed by child child class name or instance name // inheritance is possible but overriding will not possible.
        childClassNew.staticMathod();
    }
}
