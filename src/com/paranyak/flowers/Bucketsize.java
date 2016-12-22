package com.paranyak.flowers;

/**
 * Created by cs.ucu.edu.ua on 11/22/2016.
 */
public enum  Bucketsize {
    L(15), S(3), XL(25), M(10);

    Bucketsize(int size) {
        this.size = size;
    }
    private int size;

    public int getSize() {
        return size;
    }
}
