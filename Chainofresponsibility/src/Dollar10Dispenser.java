/**
 * Created by Roksolyana Lebedenko on 06.12.2016.
 */
public class Dollar10Dispenser implements Dispenser {
    public Dispenser disp;

    @Override
    public void setNext(Dispenser next) {
        this.disp = next;
    }

    @Override
    public void dispense(Currency cur) {
        if (cur.getAmount() >= 10){
            int num = cur.getAmount()/10;
            int remainder = cur.getAmount() % 10;
            System.out.println("Dispensing " + num + " 10$ note");
            if(remainder !=0){
                this.disp.dispense(new Currency(remainder));
            }
        }
        else{
            this.disp.dispense(cur);
        }
    }
}
