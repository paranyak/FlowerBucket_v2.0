package com.paranyak.order;

import com.paranyak.flowers.Item;

/**
 * Created by cs.ucu.edu.ua on 11/8/2016.
 */
abstract class ItemDecorator implements Item {
    public Item itm;
    public ItemDecorator(Item itm) {
        this.itm = itm;
    }
    public abstract String getDescription();

}
