package DSA.Patterns;

public class Patterns1 {
    public static void main (String args[]){

       // patterns1(4);
        //pattern2(4);
        //pattern3(9);
       // pattern4(10);
        pattern5(7);
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

    public static void pattern2 (int n){
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
    public static void pattern3(int n){
        int w= (n+1)/2;
        for (int i=1;i<n+1;i++){
            for (int j=1;j<w;j++)
            {
                System.out.print(j);
            }
            for(int k=w ; k>=1; k--){
                System.out.print(k);
            }
            System.out.println();
        }
    }
    public static void pattern4(int n){
        for(int i=1;i<n+1;i++){
            for(int j=1;j<n+1;j++){
                System.out.print(j);

            }
            System.out.println();
        }
    }

    public static void pattern5(int n){
        for (int i=1;i<n+1;i++){
            for (int j=1;j<n+1;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }


}
