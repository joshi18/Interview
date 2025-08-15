package DesignPatterns.StructuralDesignPattern.AdapterDP;

public class PayPalGateWay {
    public void getPayment(int amountinUSD){
        System.out.println("Payment through Paypal Gateway" + amountinUSD);
    }
}
