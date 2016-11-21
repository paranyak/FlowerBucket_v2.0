package com.paranyak.suppliers;

import com.paranyak.flowers.Flower;
import com.paranyak.flowers.FlowerBucket;
import com.paranyak.flowers.FlowerSpec;

import java.util.LinkedList;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by cs.ucu.edu.ua on 11/21/2016.
 */
public class CactusSupplierObserver implements Observer {
    Observable observable;
    public CactusSupplierObserver(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) {
        int n = 0;
        LinkedList s = (LinkedList) arg;
        FlowerSpec mySpec = new FlowerSpec();
        mySpec.setType("Cactus");
        for (Object item : s) {
            FlowerBucket fb = (FlowerBucket) item;
            n += fb.search(mySpec).length;
        }
        System.out.println("Cactus - " + n);

    }
}

