package com.paranyak.order;

import java.util.LinkedList;

/**
 * Created by cs.ucu.edu.ua on 11/12/2016.
 */
public interface IDelivery {
    /**
     * set delivery strategy
     * @param items list flowers
     */
    void deliver(LinkedList items);
}
