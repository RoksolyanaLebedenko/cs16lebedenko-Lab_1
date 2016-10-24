

/**
 * Created by Roksolyana Lebedenko on 04.10.2016.
 */
public class FlowerSpec{

    protected double price;
    protected double fresh;
    protected double length;
    protected FlowerColor color;


    public FlowerSpec(double price, double fresh, double length, FlowerColor color) {
        this.price = price;
        this.fresh = fresh;
        this.color = color;
        this.length = length;
    }

    public double getPrice() {
        return price;
    }
    public double getLength() {
        return length;
    }
    public FlowerColor getColor() {
        return color;
    }
    public double getFresh() {
        return fresh;
    }


    public void setColor(FlowerColor color) {
        this.color = color;
    }

    public void setFresh(double fresh) {
        this.fresh = fresh;
    }

    public void setPrice(double price) { this.price = price; }

    public void setLength(double length) {
        this.length = length;
    }
}




