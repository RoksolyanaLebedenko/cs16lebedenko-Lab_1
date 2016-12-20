/**
 * Created by Roksolyana Lebedenko on 06.12.2016.
 */
public interface Dispenser {

    void setNext(Dispenser next);

    void dispense(Currency cur);
}
