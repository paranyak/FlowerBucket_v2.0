package com.paranyak.order;

/**
 * Created by cs.ucu.edu.ua on 11/12/2016.
 */
public interface IPayment {
    /**
     * set payment strategy
     * @param price price of flowers
     */
    void pay(double price);
}
