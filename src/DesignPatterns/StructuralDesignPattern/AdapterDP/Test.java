package DesignPatterns.StructuralDesignPattern.AdapterDP;

public class Test {
    public static void main(String[] args) {
         //PayPalGateWay payPalGateWay =new PayPalGateWay();
         paymentProcessor payPalAdptor = new PayPalAdptor(new PayPalGateWay());
         payPalAdptor.paytheAmmount();
    }
}
