
/**
 * Created by Roksolyana Lebedenko on 04.10.2016.
 */
public class Main {
    public static void main(String[] args){

        Tulip firstTulip = new Tulip(30, 22, 2, "Red");
        Tulip secondTulip = new Tulip(30, 22, 2.5, "Yellow");
        Tulip thirdTulip = new Tulip(30, 22, 2, "Pink");
        Chamomile firstChamomile = new Chamomile(45, 30, 4.5, "White");
        Chamomile secondChamomile = new Chamomile(40, 30, 3.5, "White");
        Chamomile thirdChamomile = new Chamomile(43, 30, 1, "White");
        Chamomile fourthChamomile = new Chamomile(41, 30, 2, "White");

        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(firstTulip);
        bouquet.addFlower(secondTulip);
        bouquet.addFlower(thirdTulip);
        bouquet.addFlower(firstChamomile);
        bouquet.addFlower(secondChamomile);
        bouquet.addFlower(thirdChamomile);
        bouquet.addFlower(fourthChamomile);

        System.out.print("This bouquet sorted by fresh - ");
        bouquet.sortByFreshLevel();
        bouquet.makeBouquet();
        System.out.println("Price of bouquet = " + bouquet.Price());
        System.out.print("Flowers with given size of stalk - ");
        bouquet.sizeOfStalk(40, 41);

    }
}
