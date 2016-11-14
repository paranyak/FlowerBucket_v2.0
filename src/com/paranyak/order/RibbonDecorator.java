package com.paranyak.order;

import com.paranyak.flowers.Item;

/**
 * Created by cs.ucu.edu.ua on 11/12/2016.
 */
public class RibbonDecorator extends ItemDecorator {
    public RibbonDecorator(Item itm){
        super(itm);
    }
    @Override
    public double getTotalPrice() {
        return this.itm.getTotalPrice() + 40;
    }

    @Override
    public String getDescription() {
        return "This is RibbonDecorator";
    }
}
