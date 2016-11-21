package com.lebedenko;

import com.lebedenko.flowers.*;
import com.lebedenko.orders.*;
import com.lebedenko.orders.Order;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Roksolyana Lebedenko on 18.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        com.lebedenko.flowers.Bouquet bouquet = new com.lebedenko.flowers.Bouquet();
        com.lebedenko.flowers.FlowerSpec Tulip1 = new com.lebedenko.flowers.FlowerSpec(10, 2.5, 17, com.lebedenko.flowers.FlowerColor.RED);
        com.lebedenko.flowers.FlowerSpec Tulip2 = new com.lebedenko.flowers.FlowerSpec(20, 1.5, 18, com.lebedenko.flowers.FlowerColor.BLUE);
        com.lebedenko.flowers.FlowerSpec Tulip3 = new com.lebedenko.flowers.FlowerSpec(30, 0.5, 17, com.lebedenko.flowers.FlowerColor.GREEN);
        com.lebedenko.flowers.FlowerSpec Chamomile1 = new com.lebedenko.flowers.FlowerSpec(20, 1, 22, com.lebedenko.flowers.FlowerColor.BLACK);
        com.lebedenko.flowers.FlowerSpec Chamomile2 = new com.lebedenko.flowers.FlowerSpec(15, 4, 30, com.lebedenko.flowers.FlowerColor.BLACK);

        com.lebedenko.flowers.Tulip t1 = new com.lebedenko.flowers.Tulip(Tulip1);
        com.lebedenko.flowers.Tulip t2 = new com.lebedenko.flowers.Tulip(Tulip2);
        com.lebedenko.flowers.Tulip t3 = new com.lebedenko.flowers.Tulip(Tulip3);
        com.lebedenko.flowers.Chamomile CH1 = new com.lebedenko.flowers.Chamomile(Chamomile1);
        com.lebedenko.flowers.Chamomile CH2 = new com.lebedenko.flowers.Chamomile(Chamomile2);
        bouquet.addFlower(t1);
        bouquet.addFlower(t2);
        bouquet.addFlower(t3);
        bouquet.addFlower(CH1);
        bouquet.addFlower(CH2);

        System.out.print("This bouquet sorted by fresh - ");
        bouquet.sortByFreshLevel();
        bouquet.makeBouquet();
        System.out.println("Price of bouquet = " + bouquet.Price());
        System.out.print("Flowers with given size of stalk - ");
        bouquet.sizeOfStalk(15, 17);

        Tuple[] tpls = new Tuple[3];
        tpls[0] = new Tuple(1, 20);
        tpls[1] = new Tuple(2, 2);
        tpls[2] = new Tuple(3, 24);
        System.out.println(Arrays.toString(tpls));

        Item decoration = new PaperDecorator(new RibbonDecorator(new BasketDecorator(bouquet)));
        System.out.println(decoration.getPrice());

        Order firstOrder = new Order();
        firstOrder.addItem(bouquet);

    }
}
