/**
 * Created by Roksolyana Lebedenko on 08.10.2016.
 */
public class Main {
    public static void main(String[] args) {

        Nesquik candy1 = new Nesquik(52, 12, 100, "Chocolate");
        Lion candy3 = new Lion(45, 17, 100, "With nuts");
        Nesquik candy2 = new Nesquik(51, 16, 100, "Chocolate");
        Lion candy4 = new Lion(46, 14, 100, "With nuts");

        Gift gift = new Gift();
        gift.addCandy(candy1);
        gift.addCandy(candy2);
        gift.addCandy(candy3);
        gift.addCandy(candy4);

        System.out.print("Candies sorted by price - ");
        gift.sortByPrice();
        gift.makeGift();
        System.out.println("Weight of gift: ");
        System.out.println(gift.Weight());
        System.out.print("Candies with given sugar-level - ");
        gift.sugarLevel(30, 50);
    }
}
