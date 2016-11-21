package com.lebedenko.orders;
import com.lebedenko.orders.IDelivery.IDelivery;
import com.lebedenko.orders.IPayment.IPayment;
import com.lebedenko.suppliers.ChamomileSuplier;
import com.lebedenko.suppliers.TulipSuplier;

import java.util.LinkedList;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Roksolyana Lebedenko on 13.11.2016.
 */
public class Order extends Observable {
    public Order(){
        this.addObserver(new ChamomileSuplier());
        this.addObserver(new TulipSuplier());
    }
    private LinkedList<Item> items;
    private IDelivery delivery;
    private IPayment payment;

    public void setPaymentStrategy(IPayment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(IDelivery delivery) {
        this.delivery = delivery;
    }

    public double calculateTotalPrice() {
        int totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public void processOrder() {
        if (payment != null && delivery != null){
            payment.pay(calculateTotalPrice());
            this.notifyObservers(items);

        }
    }

    public void addItem(Item items) {
        this.items.add(items);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

}
