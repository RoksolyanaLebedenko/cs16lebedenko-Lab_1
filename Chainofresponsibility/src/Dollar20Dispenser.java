/**
 * Created by Roksolyana Lebedenko on 06.12.2016.
 */
public class Dollar20Dispenser implements Dispenser {
    public Dispenser disp;

    @Override
    public void setNext(Dispenser next) {
        this.disp = next;
    }

    @Override
    public void dispense(Currency cur) {
        if (cur.getAmount() >= 20){
            int num = cur.getAmount()/20;
            int remainder = cur.getAmount() % 20;
            System.out.println("Dispensing " + num + " 20$ note");
            if(remainder !=0){
                this.disp.dispense(new Currency(remainder));
            }
        }else{
            this.disp.dispense(cur);
        }
    }
}
