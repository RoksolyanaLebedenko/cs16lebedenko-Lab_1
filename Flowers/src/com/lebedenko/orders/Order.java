package com.lebedenko.orders;
import com.lebedenko.orders.IDelivery.IDelivery;
import com.lebedenko.orders.IPayment.IPayment;
import java.util.LinkedList;

/**
 * Created by Roksolyana Lebedenko on 13.11.2016.
 */
public class Order {
    LinkedList<Item> items = new LinkedList<>();
    IDelivery delivery;
    IPayment payment;

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
    }

    public void addItem(Item items) {
        this.items.add(items);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }


}
