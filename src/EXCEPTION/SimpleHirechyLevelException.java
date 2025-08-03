package EXCEPTION;

public class SimpleHirechyLevelException {
    
    //object -> throwable-> exception, error
    // exception -> runtime exception, compile time reception
    // All runtime exception are unchecked. // Arthematic  Exception, null pointer exception
    // compile time exception are checked. // IOException ,

    public static void main(String args[]){
        try {
            int a = 0;
            int b = 10 / a;
        }catch (ArithmeticException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }




}
