package com.paranyak.flowers;


public class FlowerSpec extends Spec {

    public FlowerSpec(double price, String type) {
        super(price);
        this.type = type;
    }
    public FlowerSpec(){
    }


    public void setPrice(double price) {
        this.price = price;
    }
    public void setPrice(String type) {
        this.type = type;
    }

    public boolean matches(FlowerSpec otherSpec) {

        if ((price != otherSpec.price) && (otherSpec.price != -1.0)) {
            return false;
        }
        if ((type != otherSpec.type) && (otherSpec.type != null)) {
            return false;
        }
        return true;
    }


    public double getPrice() {
        return price;
    }
    public String getType() {
        return type;
    }

}
