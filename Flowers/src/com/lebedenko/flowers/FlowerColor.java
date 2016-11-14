package com.lebedenko.flowers;

/**
 * Created by Roksolyana Lebedenko on 18.10.2016.
 */
public enum FlowerColor {
    BLACK, RED, GREEN, BLUE;

    @Override
    public String toString() {
        String a = "";
        switch (this){
            case GREEN: a = "Green"; break;
            case BLACK: a = "Black"; break;
            case RED: a = "Red"; break;
            case BLUE: a = "Blue"; break;
                }
        return a;
    }
}
