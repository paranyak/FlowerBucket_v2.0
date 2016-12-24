package com.paranyak.fastOrder;

import com.paranyak.order.Order;

/**
 * Created by cs.ucu.edu.ua on 11/22/2016.
 */
public class Store {
    /**
     *
     * @param bc Type of bucket (wedding or birthday)
     * @return new Order
     */
    public Order getOrder(BucketType bc){
        if(bc == BucketType.Wedding){
            Order ord = new Order();
            ord.addItem(new WeddingBucket(Bucketsize.S));
            return ord;
        }else{
            Order ord = new Order();
            ord.addItem(new BirthdayBucket(Bucketsize.S));
            return ord;
        }
    }
}
