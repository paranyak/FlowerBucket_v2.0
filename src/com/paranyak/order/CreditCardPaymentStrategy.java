package com.paranyak.order;

/**
 * Created by cs.ucu.edu.ua on 11/12/2016.
 */
public class CreditCardPaymentStrategy implements IPayment {
    @Override
    public void pay(double price) {
        System.out.println("Credit Card Payment Strategy" + ", price: " + price);    }
}
