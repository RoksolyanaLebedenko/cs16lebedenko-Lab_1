import java.util.Scanner;

/**
 * Created by Roksolyana Lebedenko on 06.12.2016.
 */
public class Main {

    private Dispenser c1;

    public Main() {
        this.c1 = new Dollar50Dispenser();
        Dispenser c2 = new Dollar20Dispenser();
        Dispenser c3 = new Dollar10Dispenser();
        c1.setNext(c2);
        c2.setNext(c3);
    }

    public static void main(String[] args) {
        Main atmDispenser = new Main();
        while (true) {
            int amount = 0;
            System.out.print("Enter amount to dispense:");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10s.");
                return;
            }
            atmDispenser.c1.dispense(new Currency(amount));
        }

    }

}
