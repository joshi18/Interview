package EXCEPTION;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class SimpleException {
    // throw keyword is specifically used to throw the exception.
    // throws keyword used inside the method argument.
    public static void main(String args[]) throws FileNotFoundException {
        // method signature is added only in case checked exception. why ? =>
        // If a method can throw a checked exception, the compiler wants to ensure:
        //
        //The caller is explicitly informed via throws, or
        //
        //The exception is handled within the method using try-catch.
        // in case of unchecked exception no need to add in the method signature.
        try {
            FileReader file = new FileReader("abhijit.txt");
        }
        catch (Exception q){
            System.out.println(q);
            throw new FileNotFoundException("file not found");

        }

    }


}
