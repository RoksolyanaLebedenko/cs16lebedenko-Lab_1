import java.text.MessageFormat;

/**
 * Created by Roksolyana Lebedenko on 08.10.2016.
 */
public class Gift {
    private int max = 10;

    private Candy[] candy = new Candy[max];

    private int lastIndex = 0;

    void addCandy(Candy newCandy){

        if (max - 1 < lastIndex) {
            Candy[] newCandies = new Candy[max * 2];
            for (int i = 0; i < max; i++){
                newCandies[i] = candy[i];
            }
            max = max * 2;
            candy = newCandies;
        }
        else {
            candy[lastIndex] = newCandy;
            lastIndex++;
        }

    }

    void sortByPrice(){
        double curr;
        for (int i = 1; i < lastIndex; i++) {
            for(int j = i ; j > 0 ; j--){
                if(candy[j].price < candy[j-1].price){
                    curr = candy[j].price;
                    candy[j].price = candy[j-1].price;
                    candy[j-1].price = curr;
                }
            }
        }

    }

    void makeGift(){
        for (int i = 0; i < lastIndex; i++){
            System.out.println(MessageFormat.format("{0}: Type = {1}, Price = {2}, Sugar = {3}, Weight = {4}",
                    candy[i].getClass().getSimpleName(), candy[i].getType(), candy[i].getPrice(), candy[i].sugar, candy[i].weight));
        }
    }

    double Weight(){
        double weight = 0;
        for (int i = 0; i < lastIndex; i++){
            weight += candy[i].getWeight();
        }
        return weight;
    }

    void sugarLevel(double size1, double size2){
        for (int i = 1; i < lastIndex; i++){
            if (size1 <=  candy[i].sugar && candy[i].sugar <= size2){
                System.out.println(MessageFormat.format("{0}:  Sugar = {1}",
                        candy[i].getClass().getSimpleName(), candy[i].sugar));
            }
        }
    }
}
