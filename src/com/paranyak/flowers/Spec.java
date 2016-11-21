package com.paranyak.flowers;

/**
 * Created by cs.ucu.edu.ua on 10/25/2016.
 */
public class Spec {


    protected double price;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    protected String type;

    public Spec(double price) {
        this.price = price;
    }

    public Spec() {

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}

