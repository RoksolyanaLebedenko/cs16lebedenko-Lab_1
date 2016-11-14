package com.lebedenko.orders;

/**
 * Created by Roksolyana Lebedenko on 08.11.2016.
 */
public class PaperDecorator extends AbstractItemDecorator{

    public PaperDecorator(Item decoratingItem){
        super(decoratingItem);
    }

    @Override
    public double getPrice() {
        System.out.println("Paper decoration");
        System.out.println("+");
        return this.decoratingItem.getPrice() + 13;
    }

}
