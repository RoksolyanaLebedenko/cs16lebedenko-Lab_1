package com.lebedenko.orders.IPayment;

import com.lebedenko.orders.IPayment.IPayment;

/**
 * Created by Roksolyana Lebedenko on 13.11.2016.
 */
public class PayPalPaymentStrategy implements IPayment {

    @Override
    public boolean pay(double price) {
        return true;
    }
}
