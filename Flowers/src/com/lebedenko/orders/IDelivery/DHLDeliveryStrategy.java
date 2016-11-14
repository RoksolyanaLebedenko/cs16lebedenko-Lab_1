package com.lebedenko.orders.IDelivery;

import com.lebedenko.orders.IDelivery.IDelivery;
import com.lebedenko.orders.Item;

/**
 * Created by Roksolyana Lebedenko on 13.11.2016.
 */
public class DHLDeliveryStrategy implements IDelivery {

    @Override
    public boolean deliver(Item item) {
        return true;
    }
}
