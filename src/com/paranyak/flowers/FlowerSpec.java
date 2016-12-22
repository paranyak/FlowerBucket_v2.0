package com.paranyak.flowers;


public class FlowerSpec extends Spec {

    public FlowerSpec(double price, FlowerColor color, String type) {
        super(price, color);
        this.type = type;
    }
    public FlowerSpec(){
    }


    /**
     *
     * @param price number(price of flower)
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     *
     * @param type type of flower
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @param color color of flower
     */
    public void  setColor(FlowerColor color){this.color = color;}

    /**
     *
     * @param otherSpec flower specifications which we want to find
     * @return if we can find this flower
     */

    public boolean matches(FlowerSpec otherSpec) {

        if ((price != otherSpec.price) && (otherSpec.price != -1.0)) {
            return false;
        }
        if ((type != otherSpec.type) && (otherSpec.type != null)) {
            return false;
        }
        if((color != otherSpec.color) && (otherSpec.color != FlowerColor.NOCOLOR)){
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
    public FlowerColor getColor(){return color;}
}
