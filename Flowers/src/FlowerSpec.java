

/**
 * Created by Roksolyana Lebedenko on 04.10.2016.
 */
public class FlowerSpec{


    protected FlowerColor color;
    protected double length;
    protected double fresh;
    protected double price;
    protected String type;


    public String getType() {
        return type;
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

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) { this.price = price; }

    public void setLength(double length) {
        this.length = length;
    }
}




