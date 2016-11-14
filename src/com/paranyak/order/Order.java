package com.paranyak.order;

import com.paranyak.flowers.FlowerBucket;
import com.paranyak.flowers.Item;
import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.LinkedList;

/**
 * Created by cs.ucu.edu.ua on 11/14/2016.
 */
public class Order {
    public LinkedList<FlowerBucket> items;
    protected IPayment payment;
    protected IDelivery delivery;

    public Order(){
        items = new LinkedList<>();
    };
    public void proccessOrder(){
        getDeliveryStrategy().deliver(items);
        getPaymentStrategy().pay(calculateTotalPrice());
    }
    public void setPaymentStrategy(IPayment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(IDelivery delivery) {
        this.delivery = delivery;
    }

    public IDelivery getDeliveryStrategy() {
        return this.delivery;
    }

    public IPayment getPaymentStrategy() {
        return this.payment;
    }

    public double calculateTotalPrice() {
        double totalP = 0.0;
        for (int i = 0; i < items.size(); i++) {
            totalP += items.get(i).getTotalPrice();
        }
        return totalP;
    }

    public void addItem(Item itm) {
        items.add((FlowerBucket) itm);
    }

    public void removeItem(Item itm) {
        items.remove(itm);
    }
}
