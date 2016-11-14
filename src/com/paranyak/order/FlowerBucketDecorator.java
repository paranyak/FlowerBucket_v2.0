package com.paranyak.order;

import com.paranyak.flowers.FlowerBucket;

/**
 * Created by cs.ucu.edu.ua on 11/14/2016.
 */
public class FlowerBucketDecorator extends FlowerBucket{
    FlowerBucket fb ;
    public FlowerBucketDecorator(FlowerBucket fb) {
        this.fb = fb;
    }
    @Override
    public double getTotalPrice(){
        return fb.getTotalPrice() + 10;
    }


}
