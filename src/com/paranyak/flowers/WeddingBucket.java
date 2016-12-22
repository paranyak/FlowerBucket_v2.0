package com.paranyak.flowers;

/**
 * Created by cs.ucu.edu.ua on 11/22/2016.
 */
public class WeddingBucket extends FlowerBucket {
    public WeddingBucket(Bucketsize sz){
            for(int i = 0; i < sz.getSize(); i++ ) {
                FlowerSpec sp = new FlowerSpec();
                sp.setType("Tulip");
                Flower fr = new Flower(sp);
                this.addFlower(fr);

            }

    }
}
