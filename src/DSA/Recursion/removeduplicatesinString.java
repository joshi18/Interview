package DSA.Recursion;

public class removeduplicatesinString {
    public static void main(String args[]){
        String  s = "abccbccba";
        System.out.println(removetheduplicates(s,0,s.length()));
    }

    public static String  removetheduplicates(String s, int i,int n){
        if(s.charAt(i)==s.charAt(i+1) && i<=n-1){
            s.replace(String.valueOf(s.charAt(i)), "");
            s.replace(String.valueOf(s.charAt(i)), "");
            removetheduplicates(s,i+1,n);  //In microservices, how would you securely manage configuration settings across environments?

        }//Use AWS Secrets Manager or Spring Cloud Config
        if(i==n || i==0){
            return "";
        }
        return removetheduplicates(s,i+1,n);
    }
}
