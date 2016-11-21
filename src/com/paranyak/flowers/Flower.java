package com.paranyak.flowers;


public class Flower {

    protected  FlowerSpec spec;

    public Flower (Spec spec) {
        this.spec = (FlowerSpec) spec;
    }

    public double getPrice() {
        return spec.getPrice();
    }

    public String getType() {return  spec.getType();}

    public FlowerSpec getSpec(){
        return spec;
    }

    public String toString() {
        return ", Price:  " + String.valueOf(getPrice()) + " type" + getType();
    }

}
