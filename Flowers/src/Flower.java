

/**
 * Created by Roksolyana Lebedenko on 04.10.2016.
 */

abstract class Flower{

    public abstract boolean hasSpikes();

    double size = 0;

    private double price = 0;

    double fresh = 0;

    private String color = "";

    public double getSize() {
        return size;
    }

    void setSize(double size) {
        this.size = size;
    }


    double getPrice() {
        return price;
    }

    void setPrice(double price) {

        this.price = price;
    }

    public double getFresh() {
        return fresh;
    }

    void setFresh(double fresh) {
        this.fresh = fresh;
    }

    String getColor() {

        return color;
    }

    void setColor(String color) {

        this.color = color;
    }
}

