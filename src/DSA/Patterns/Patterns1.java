package DSA.Patterns;

public class Patterns1 {
    public static void main (String args[]){

       // patterns1(4);
        Pattern2(4);
    }
    public static void patterns1(int n){
        for(int i=1;i<n+1;i++){
            for (int j=1; j<n+1;j++){
                System.out.print(i);
                // we can put n instead  of i  so that required result will get printed.
            }
            System.out.println();

        }





       //4444
            // 4444
            // 4444
            // 4444

    }

    public static void Pattern2 (int n){
        for (int i = 1; i<n+1;i++){
            for (int j = 1 ; j<n+1;j++){
                System.out.print(j);
            }
            System.out.println();
            //123
            //123
            //123
        }

    }


}
