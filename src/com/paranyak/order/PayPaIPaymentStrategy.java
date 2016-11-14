package com.paranyak.order;

/**
 * Created by cs.ucu.edu.ua on 11/12/2016.
 */
public class PayPaIPaymentStrategy implements IPayment {
    @Override
    public void pay(double price) {
        System.out.println("Price is :" + price + " PayPaIPayment Strategy");
    }
}
