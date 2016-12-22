package com.paranyak.flowers;

/**
 * Created by cs.ucu.edu.ua on 10/25/2016.
 */
abstract public class Spec {

    public Spec(double price, FlowerColor color) {
        this.price = price;
        this.color = color;
    }

    public Spec() {

    }
    protected double price;
    protected String type;

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    protected FlowerColor color;

    public FlowerColor getColor(){
        return color;
    }
    public void setColor(FlowerColor color){this.color = color;}


}

