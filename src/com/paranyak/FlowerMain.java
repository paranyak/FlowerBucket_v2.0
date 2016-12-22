package com.paranyak;


import com.paranyak.flowers.Flower;
import com.paranyak.flowers.FlowerBucket;
import com.paranyak.flowers.FlowerColor;
import com.paranyak.flowers.FlowerSpec;
import com.paranyak.order.Order;
import com.paranyak.order.PayPaIPaymentStrategy;
import com.paranyak.order.PostDeliveryStrategy;

public class FlowerMain {

    public static void main(String args[]) {
        System.out.println("Creating order...");
        Order myOrder = new Order();
        myOrder.setDeliveryStrategy(new PostDeliveryStrategy());
        myOrder.setPaymentStrategy(new PayPaIPaymentStrategy());
        FlowerBucket fb = new FlowerBucket();
        FlowerSpec spec = new FlowerSpec(11, FlowerColor.PINK,"Cactus");
        Flower f1 = new Flower(spec);
        Flower f2 = new Flower(new FlowerSpec(100.0, FlowerColor.GREEN,"Cactus"));
        fb.addFlower(f1);
        fb.addFlower(f2);
        myOrder.addItem(fb);
        System.out.println("Type of delivery and payment:");
        myOrder.proccessOrder();
        System.out.println("Total price: ");
        System.out.println(myOrder.calculateTotalPrice());
    }
}
