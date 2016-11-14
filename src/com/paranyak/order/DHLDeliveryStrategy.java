package com.paranyak.order;

import java.util.LinkedList;

/**
 * Created by cs.ucu.edu.ua on 11/12/2016.
 */
public class DHLDeliveryStrategy implements IDelivery {
    @Override
    public void deliver(LinkedList items) {
        System.out.println("DHL Delivery Strategy");;
    }
}
