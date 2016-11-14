package com.paranyak;

import com.paranyak.flowers.Flower;
import com.paranyak.flowers.FlowerBucket;
import com.paranyak.flowers.FlowerSpec;
import com.paranyak.order.FlowerBucketDecorator;
import com.paranyak.order.Order;
import com.paranyak.order.PayPaIPaymentStrategy;
import com.paranyak.order.PostDeliveryStrategy;

/**
 * Created by cs.ucu.edu.ua on 11/14/2016.
 */
public class DecoratorMain {
    public static void main(String args[]) {
        FlowerBucket fb = new FlowerBucket();
        FlowerSpec spec = new FlowerSpec(11);
        Flower f1 = new Flower(spec);
        Flower f2 = new Flower(new FlowerSpec(100.0));
        fb.addFlower(f1);
        fb.addFlower(f2);
        System.out.println(fb.getTotalPrice());
        FlowerBucketDecorator fbDecor = new FlowerBucketDecorator(fb);
        System.out.println(fbDecor.getTotalPrice());
    }
}
