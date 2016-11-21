package com.paranyak;

import com.paranyak.flowers.Flower;
import com.paranyak.flowers.FlowerBucket;
import com.paranyak.flowers.FlowerSpec;
import com.paranyak.order.FlowerBucketDecorator;

/**
 * Created by cs.ucu.edu.ua on 11/14/2016.
 */
public class DecoratorMain {
    public static void main(String args[]) {
        System.out.println("Creating new bucket...");
        FlowerBucket fb = new FlowerBucket();
        FlowerSpec spec = new FlowerSpec(11, "Cactus");
        Flower f1 = new Flower(spec);
        Flower f2 = new Flower(new FlowerSpec(100.0, "Cactus"));
        fb.addFlower(f1);
        fb.addFlower(f2);
        System.out.println("Adding new flowers...");
        System.out.println("Price without decor is: ");

        System.out.println(fb.getTotalPrice());
        FlowerBucketDecorator fbDecor = new FlowerBucketDecorator(fb);
        System.out.println("Price with decor is (+10): ");
        System.out.println(fbDecor.getTotalPrice());
    }
}
