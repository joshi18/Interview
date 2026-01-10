package src.CoreJava;

public class StrinngBuilderVsString {

    public static void main(String[] args) {
        // checkStringValues();
        compareStringBuilderandStringBuffer();
    }

    public static void checkStringValues() {

        String s1 = "Hello";  // memory allocated in String Constant Pool which is in the heap.// Immutable.
        String s2 = "Hello"; // Imutable  //  memory allocated in String Constant Pool which is in the heap. // If the string already exists inside string pool constants then no new string is created.
        System.out.println(s1.equals(s2)); // contest check karto // TRUE
        System.out.println(s1 == s2); // CHeck memory location // TRUE (same string same memory location)
        String s3 = new String("Hello"); // It is stored in Heap area not SCP
        System.out.println(s3.equals(s2)); // TRUE
        System.out.println(s3 == s2); // FALSE
        String s4 = new String("Hello");
        System.out.println(s3.equals(s4)); // TRUE // SAME CONTENT
        System.out.println(s3 == s4); // FALSE // A new memory allocated inside the heap if the object same object/String is there. New memory is allocated every time

    }

    public static void compareStringBuilderandStringBuffer() {

        String s1 = "Hello"; // SCP
        StringBuffer s2 = new StringBuffer("Hello");  // Mutable and Thread Safe (Synchronized). So that it takes time to more than StringBuilder. (Not Synchronized)
        System.out.println(s2.equals(s1));// FALSE  // In case of StringBuffer,  Equals method will not executed.
        //System.out.println(s1==s2); // FALSE// SCP VS HEAP // Compile time error.
        StringBuffer s3 = new StringBuffer("Hello");
        System.out.println(s2.equals(s3));  // FALSE  // Euals method is not executed
        System.out.println(s2 == s3); // FALSE   // every time new memory is allocated for new object.


        // StringBuilder method is not thread safe (Not synchronized) // So it Faster than StringBuffer // MUTABLE
        StringBuilder e1 = new StringBuilder("Hello");
        StringBuilder e2 = new StringBuilder("Hello");
        System.out.println(e2.equals(e1)); // FALSE // In case of String Builder,  Equals method will not executed .
        System.out.println(e1 == e2); // FASLE // New memory is allocated every time
    }
}
