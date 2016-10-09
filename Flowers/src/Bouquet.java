

import java.text.MessageFormat;

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
            for (int i = 0; i < max; i++){
                newFlwrs[i] = flwrs[i];
            }
            max = max * 2;
            flwrs = newFlwrs;
        }
        else {
            flwrs[lastIndex] = newFlwr;
            lastIndex++;
        }

    }

    void sortByFreshLevel(){

        double curr;
        for (int i = 1; i < lastIndex; i++) {
            for(int j = i ; j > 0 ; j--){
                if(flwrs[j].fresh < flwrs[j-1].fresh){
                    curr = flwrs[j].fresh;
                    flwrs[j].fresh = flwrs[j-1].fresh;
                    flwrs[j-1].fresh = curr;
                }
            }
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
            if (size1 <=  flwrs[i].size && flwrs[i].size <= size2){
                System.out.println(MessageFormat.format("{0}:  Size = {1}",
                        flwrs[i].getClass().getSimpleName(), flwrs[i].size));
            }
        }
    }

    void makeBouquet(){
        for (int i = 0; i < lastIndex; i++){
            System.out.println(MessageFormat.format("{0}: Color = {1}, Price = {2}, Size = {3}, Fresh = {4}",
                    flwrs[i].getClass().getSimpleName(), flwrs[i].getColor(), flwrs[i].getPrice(), flwrs[i].size, flwrs[i].fresh));
        }
    }
}
