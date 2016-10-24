import java.util.Arrays;

/**
 * Created by Roksolyana Lebedenko on 18.10.2016.
 */
public class Main {
    public static void main(String[] args) {


        Bouquet bouquet = new Bouquet();
        FlowerSpec Tulip1 = new FlowerSpec(10, 2.5, 17, FlowerColor.RED);
        FlowerSpec Tulip2 = new FlowerSpec(20, 1.5, 18, FlowerColor.BLUE);
        FlowerSpec Tulip3 = new FlowerSpec(30, 0.5, 17, FlowerColor.GREEN);
        FlowerSpec Chamomile1 = new FlowerSpec(20, 1, 22, FlowerColor.BLACK);
        FlowerSpec Chamomile2 = new FlowerSpec(15, 4, 30, FlowerColor.BLACK);

        Tulip t1 = new Tulip(Tulip1);
        Tulip t2 = new Tulip(Tulip2);
        Tulip t3 = new Tulip(Tulip3);
        Chamomile CH1 = new Chamomile(Chamomile1);
        Chamomile CH2 = new Chamomile(Chamomile2);
        bouquet.addFlower(t1);
        bouquet.addFlower(t2);
        bouquet.addFlower(t3);
        bouquet.addFlower(CH1);
        bouquet.addFlower(CH2);

        System.out.print("This bouquet sorted by fresh - ");
        bouquet.sortByFreshLevel();
        bouquet.makeBouquet();
        System.out.println("Price of bouquet = " + bouquet.Price());
        System.out.print("Flowers with given size of stalk - ");
        bouquet.sizeOfStalk(15, 17);
        System.out.println("Searched flower:");
        System.out.println(Arrays.toString(bouquet.search(new FlowerSpec(20, 1, 22, FlowerColor.BLACK))));
    }
}
