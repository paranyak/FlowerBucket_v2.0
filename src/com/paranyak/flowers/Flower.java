package com.paranyak.flowers;


public class Flower {

    protected  FlowerSpec spec;

    public Flower (Spec spec) {
        this.spec = (FlowerSpec) spec;
    }

    /**
     *
     * @return price of flower
     */
    public double getPrice() {
        return spec.getPrice();
    }

    /**
     *
     * @return type of flower
     */
    public String getType() {return  spec.getType();}

    /**
     *
     * @return color of flower
     */
    public FlowerColor getColor(){return  spec.getColor();}

    public FlowerSpec getSpec(){
        return spec;
    }

    /**
     *
     * @return string with price and type of flower
     */
    public String toString() {
        return ", Price:  " + String.valueOf(getPrice()) + " type" + getType();
    }

}
