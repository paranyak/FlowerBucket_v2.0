package com.paranyak.order;

import com.paranyak.flowers.Item;

/**
 * Created by cs.ucu.edu.ua on 11/12/2016.
 */
public class PaperDecorator extends ItemDecorator{
    public PaperDecorator(Item itm){
        super(itm);
    }

    @Override
    public double getTotalPrice() {
        return this.itm.getTotalPrice() + 13.0;
    }

    @Override
    public String getDescription() {
        return "This is paperDecorator";
    }
}
