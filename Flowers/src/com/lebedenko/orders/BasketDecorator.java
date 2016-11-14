package com.lebedenko.orders;

/**
 * Created by Roksolyana Lebedenko on 11.11.2016.
 */
public class BasketDecorator extends AbstractItemDecorator{
    public BasketDecorator(Item decoratingItem){
        super(decoratingItem);
    }

    @Override
    public double getPrice() {
        System.out.println("Basket decoration");
        System.out.println("+");
        return this.decoratingItem.getPrice() + 4;
    }
}
