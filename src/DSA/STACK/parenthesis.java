package src.DSA.STACK;

import java.util.Stack;

public class parenthesis {

    public static void main(String[] args) {

        String abcd = "()[{}]";
        Stack parenthesis = new Stack<>();
        for (int i=0;i<abcd.length();i++){
            if (String.valueOf(abcd.charAt(i)).equals("(") || String.valueOf( abcd.charAt(i)).equals("{") || String.valueOf(abcd.charAt(i)).equals("[")){

                parenthesis.push(String.valueOf(abcd.charAt(i)));

            }
            else {
                if (parenthesis.isEmpty()){
                    System.out.println(false);
                    break;
                }
                else {
                    String element = parenthesis.pop().toString();
                    if ((element == "{"  && String.valueOf(abcd.charAt(i)) == "}") || (element == "["  && String.valueOf(abcd.charAt(i)) == "]") || (element == "("  && String.valueOf(abcd.charAt(i)) == ")") ){
                        System.out.println("No problem ");
                    }
                    else {
                        System.out.println("Not parenthesis");
                        System.out.println(false);
                        break;
                    }
                }
            }
        }
        if (parenthesis.size()==0){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
