package com.paranyak.flowers;

public class FlowerBucket implements  Item{
    private int defaultSize = 10;

    private int insertIndex = 0; // insert, or better create method length()
    private Flower[] a = new Flower[defaultSize];

    /**
     * add flower to bucket
     * if size of bucket is to small, create new bigger bucket
     * @param nw new flower
     */
    public void addFlower(Flower nw) {
        checkSize();
        a[insertIndex] = nw;
        insertIndex++;
    }

    /**
     * check size of bucket
     * create bigger bucket, if our bucket is to small for adding new flower
     */
    private void checkSize() {
        if (insertIndex == defaultSize - 1) {
            defaultSize *= 2;
            Flower[] b = new Flower[defaultSize];
            for (int i = 0; i <= insertIndex; i++) {
                b[i] = a[i];
            }
            a = b;
        }
    }

    /**
     * sort all flowers by price
     */
    public void sortByPrice() {
        for (int i = 1; i < insertIndex; i++) {
            Flower tmp = a[i];
            int j = i - 1;
            while (j >= 0 && (a[i].getPrice() < a[j].getPrice())) {
                a[i] = a[j];
                j--;
            }
            a[j + 1] = tmp;
        }
    }

    /**
     *
     * @return String with information about all current flowers in bucket
     */
    public String toString() {
        String s = "";
        for (int i = 0; i < insertIndex; i++) {
            s += a[i].toString() + "\n";
        }
        return s;
    }

    /**
     *
     * @return sum of a bucket
     */
    public double getTotalPrice() {
        double sum = 0;
        for (int i = 0; i < insertIndex; i++) {
            sum += a[i].getPrice();
        }
        return sum;
    }

    @Override
    public String getDescription() {
        return null;
    }


    /**
     *
     * @param searchSpec flower which we want to find
     * @return current flower with this specifications
     */
    public Flower[] search(FlowerSpec searchSpec) {
        int indexF = 0;
        for (int i = 0; i < insertIndex; i++) {
            if (a[i].getSpec().matches(searchSpec)) {
                indexF++;
            }
        }
        int t = 0;
        Flower[] newF1 = new Flower[indexF];
        for (int i = 0; i < insertIndex; i++) {
            if (a[i].getSpec().matches(searchSpec)) {
                newF1[t] = a[i];
                t++;
            }

        }
        return newF1;

    }


}