package com.paranyak.fastOrder;

import com.paranyak.fastOrder.Bucketsize;
import com.paranyak.flowers.Flower;
import com.paranyak.flowers.FlowerBucket;
import com.paranyak.flowers.FlowerColor;
import com.paranyak.flowers.FlowerSpec;

/**
 * Created by cs.ucu.edu.ua on 11/22/2016.
 */
public class WeddingBucket extends FlowerBucket {
    FlowerBucket bucketForWedding = new FlowerBucket();

    /**
     *
     * @param sz size of each bucket
     */
    public WeddingBucket(Bucketsize sz){
            for(int i = 0; i < sz.getSize(); i++ ) {
                FlowerSpec sp = new FlowerSpec();
                sp.setType("Tulip");
                sp.setColor(FlowerColor.PINK);
                sp.setPrice(10.0);
                Flower fr = new Flower(sp);
                bucketForWedding.addFlower(fr);
            }

    }
}
