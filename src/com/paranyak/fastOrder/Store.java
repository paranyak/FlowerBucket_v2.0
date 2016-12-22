package com.paranyak.fastOrder;

import com.paranyak.flowers.BucketType;
import com.paranyak.flowers.Bucketsize;
import com.paranyak.flowers.Item;
import com.paranyak.flowers.WeddingBucket;
import com.paranyak.order.Order;

/**
 * Created by cs.ucu.edu.ua on 11/22/2016.
 */
public class Store extends Order {
    public Order getOrder(BucketType bc){
        if(bc == BucketType.Wedding){
            Order ord = new Order();
            ord.addItem(new WeddingBucket(Bucketsize.L) {
            });
        }
        return new Order();
    }
}
