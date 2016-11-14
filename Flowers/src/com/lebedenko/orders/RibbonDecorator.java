package com.lebedenko.orders;

/**
 * Created by Roksolyana Lebedenko on 11.11.2016.
 */
public class RibbonDecorator extends AbstractItemDecorator{
    public RibbonDecorator(Item decoratingItem){
        super(decoratingItem);
    }

    @Override
    public double getPrice() {
        System.out.println("Ribon decoration");
        System.out.println("+");
        return this.decoratingItem.getPrice() + 40;
    }

}
