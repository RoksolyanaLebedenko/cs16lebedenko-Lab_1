/**
 * Created by Roksolyana Lebedenko on 18.10.2016.
 */

public class Flower {

    protected FlowerSpec spec;

    public Flower(FlowerSpec spec){
        this.spec = spec;
    }

    public String getType() {

        return spec.getType();
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
        return "Type: " + getType() + " price is " + String.valueOf(getPrice())
                + " its color is " + getColor() + " fresh level is " + String.valueOf(getFresh())
                + " its height " + String.valueOf(getLength());
    }

}


