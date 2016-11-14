package com.paranyak.flowers;


public class FlowerSpec extends Spec {

    public FlowerSpec(double price) {
        super(price);
    }


    public void setPrice(double price) {
        this.price = price;
    }


    public boolean matches(FlowerSpec otherSpec) {

        if ((price != otherSpec.price) && (otherSpec.price != -1.0)) {
            return false;
        }

        return true;
    }


    public double getPrice() {
        return price;
    }

}
