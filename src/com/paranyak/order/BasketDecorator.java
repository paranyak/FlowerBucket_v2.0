package com.paranyak.order;

import com.paranyak.flowers.Item;

/**
 * Created by cs.ucu.edu.ua on 11/12/2016.
 */
public class BasketDecorator extends ItemDecorator {
    public BasketDecorator(Item itm) {
        super(itm);
    }

    @Override
    public double getTotalPrice() {
        return this.itm.getTotalPrice() + 4.0;
    }

    @Override
    public String getDescription() {
        return "This is BasketDecorator";
    }
}
