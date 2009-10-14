package org.cojug.modular.microbrewery.fulfillment;

public interface FulfillmentService
{
    void shipBeer(String customerId, String beer, int qty);
}

