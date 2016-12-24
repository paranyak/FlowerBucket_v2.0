package com.paranyak.fastOrder;

/**
 * Created by cs.ucu.edu.ua on 11/22/2016.
 */
public enum  Bucketsize {
    L(15), S(3), XL(25), M(10);

    Bucketsize(int size) {
        this.size = size;
    }
    private int size;

    /**
     *
     * @return size of each characteristic L- 15, S - 3, XL - 25, M - 10
     */
    public int getSize() {
        return size;
    }
}
