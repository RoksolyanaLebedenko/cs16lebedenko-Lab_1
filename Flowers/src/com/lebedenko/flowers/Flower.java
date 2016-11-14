package com.lebedenko.flowers;

/**
 * Created by Roksolyana Lebedenko on 18.10.2016.
 */

public class Flower {

    protected FlowerSpec spec;

    public Flower(FlowerSpec spec){

        this.spec = spec;
    }

    public double getPrice() {
        return spec.getPrice();
    }

    public double getLength() {
        return spec.getLength();
    }

    public FlowerColor getColor() {
        return spec.getColor();
    }

    public double getFresh() {
        return spec.getFresh();
    }


    public String toString() {
        return  " Price:" + String.valueOf(getPrice())
                + "Color:" + getColor() + "Fresh: " + String.valueOf(getFresh())
                + "Stem size:" + String.valueOf(getLength());
    }

}


