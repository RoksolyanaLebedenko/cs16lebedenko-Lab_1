import java.text.MessageFormat;
import java.util.Iterator;
import java.util.Objects;

/**
 * Created by Roksolyana Lebedenko on 04.10.2016.
 */
class Bouquet {
    private int max = 16;

    private Flower[] flwrs = new Flower[max];

    private int lastIndex = 0;

    void addFlower(Flower newFlwr){

        if (max - 1 < lastIndex) {
            Flower[] newFlwrs = new Flower[max * 2];
            System.arraycopy(flwrs, 0, newFlwrs, 0, max);
            max = max * 2;
            flwrs = newFlwrs;
        }
        else {
            flwrs[lastIndex] = newFlwr;
            lastIndex++;
        }

    }

    public Flower[] search(FlowerSpec spec){

        Flower[] new_f = new Flower[lastIndex+1];
        int counter = 0;
        for (Flower i: this.flwrs) {
            if (i.getFresh() == spec.getFresh()) {
                counter += 1;
            }
            if (i.getLength() == spec.getLength()) {
                counter += 1;
            }
            if (i.getColor() == spec.getColor()) {
                counter += 1;
            }
            if (i.getPrice() == spec.getPrice()) {
                counter += 1;
            }
        }
        Flower[] matching = new Flower[counter + 1];
            if (counter == 5){
                System.arraycopy(new_f, 0, matching, 0, counter + 1);
            }

        return matching;
    }

    void sortByFreshLevel(){
        for (int i = 1; i < lastIndex; i++){
            double curr = flwrs[i].getFresh();
            Flower flo = flwrs[i];
            int index = i;
            while (index > 0 && flwrs[index - 1].getFresh() > curr){
                flwrs[index] = flwrs[index - 1];
                index = index - 1;
            }
            flwrs[index] = flo;
        }
    }

    double Price(){
        double sum = 0;
        for (int i = 0; i < lastIndex; i++){
            sum += flwrs[i].getPrice();
        }
        return sum;
    }

    void sizeOfStalk(double size1, double size2){
        for (int i = 1; i < lastIndex; i++){
            if (size1 <=  flwrs[i].getLength() && flwrs[i].getLength() <= size2){
                System.out.println(MessageFormat.format("{0}:  Size = {1}",
                        flwrs[i].getClass().getSimpleName(), flwrs[i].getLength()));
            }
        }
    }

    void makeBouquet(){
        for (int i = 0; i < lastIndex; i++){
            System.out.println(MessageFormat.format("{0}: Color = {1}, Price = {2}, Size = {3}, Fresh = {4}",
                    flwrs[i].getClass().getSimpleName(), flwrs[i].getColor(), flwrs[i].getPrice(),
                    flwrs[i].getLength(), flwrs[i].getFresh()));
        }
    }
}