/**
 * Created by Roksolyana Lebedenko on 08.10.2016.
 */
public class Candy {
    double sugar = 0;

    double price = 0;

    double weight = 0;

    private String type = "";

    public double getSugar() {

        return sugar;
    }
    void setSugar(double size) {

        this.sugar = size;
    }

    double getPrice() {

        return price;
    }
    void setPrice(double price) {

        this.price = price;
    }

    public double getWeight() {

        return weight;
    }
    void setWeight(double weight) {

        this.weight = weight;
    }

    String getType() {

        return type;
    }
    void setType(String type) {

        this.type = type;
    }

}
