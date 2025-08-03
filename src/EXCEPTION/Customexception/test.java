package EXCEPTION.Customexception;

public class test {

    public static void main (String args []) throws doNotHaveMoneyCustomException {
        int balance = 10;
        int amountWithdrew = 111;
//        if (amountWithdrew>balance){
//            throw new doNotHaveMoneyCustomException(amountWithdrew);
//        }

        try{
            throw new doNotHaveMoneyCustomException(amountWithdrew);
        } catch (doNotHaveMoneyCustomException e) {
            System.out.println(e.amount);
        }

    }

}
