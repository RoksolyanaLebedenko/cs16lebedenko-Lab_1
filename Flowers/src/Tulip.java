
/**
 * Created by Roksolyana Lebedenko on 04.10.2016.
 */
class Tulip extends Flower{
    Tulip(double size, double price, double fresh, String color){
        this.setSize(size);
        this.setPrice(price);
        this.setFresh(fresh);
        this.setColor(color);
    }

    @Override
    public boolean hasSpikes() {
        return false;
    }
}
