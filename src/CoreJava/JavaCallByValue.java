package CoreJava;

public class JavaCallByValue {
    public static void main(String[] args) {
        // Strictly call by Value.
//        You always pass a copy of the value to a method.
//                If it’s an object, that means you pass a copy of the reference (not the actual object and not the original reference).
        int x = 50 ;
        System.out.println(checkCallByValue(x));
        System.out.println(x); // x remains unchanged → value is passed, and a copy is modified inside the method.


    }

    public static int checkCallByValue(int a){
         a= 100;
        return a;

    }


//    What gets passed	       What happens
//    Primitive value	           A copy of the value is passed
//    Object reference	           A copy of the reference is passed

//    You can modify the object, but not the reference itself.



}
