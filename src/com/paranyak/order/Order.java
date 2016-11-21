package com.paranyak.order;

import com.paranyak.flowers.FlowerBucket;
import com.paranyak.flowers.Item;

import java.util.LinkedList;
import java.util.Observable;

/**
 * Created by cs.ucu.edu.ua on 11/14/2016.
 */
public class Order extends Observable{
    public LinkedList<FlowerBucket> items;
    protected IPayment payment;
    protected IDelivery delivery;
    //protected LinkedList<Observable> observers;
    public Order(){
        items = new LinkedList<>();
        //observers = new LinkedList<>();
    };
    public void proccessOrder(){
        getDeliveryStrategy().deliver(items);
        getPaymentStrategy().pay(calculateTotalPrice());
        this.notifyObservers(items);
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
