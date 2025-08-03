package EXCEPTION.Customexception;

public class doNotHaveMoneyCustomException extends Exception{

    int amount;
    int name;

    public doNotHaveMoneyCustomException(int amount){
        super("you do  not have enough money");
        this.amount = amount;

    }


}
