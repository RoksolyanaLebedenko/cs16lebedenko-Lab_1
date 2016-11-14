package com.lebedenko.orders;

/**
 * Created by Roksolyana Lebedenko on 08.11.2016.
 */
abstract class AbstractItemDecorator implements Item {

    protected Item decoratingItem;

    public AbstractItemDecorator(Item decoratingItem){
        this.decoratingItem = decoratingItem;
    }

    public double getPrice(){
        return decoratingItem.getPrice();
    }

}
