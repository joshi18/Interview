package DesignPatterns.StructuralDesignPattern.AdapterDP;

public class PayPalAdptor implements paymentProcessor{

    protected  PayPalGateWay payPalGateWay;

    public PayPalAdptor(PayPalGateWay payPalGateWay){
        this.payPalGateWay = payPalGateWay;
    }


    @Override
    public void paytheAmmount() {
        System.out.println("Amount paid through paypal Adaptor");
    }
}
