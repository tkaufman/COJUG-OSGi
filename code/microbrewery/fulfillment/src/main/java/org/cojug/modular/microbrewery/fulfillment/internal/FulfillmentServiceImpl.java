package org.cojug.modular.microbrewery.fulfillment.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.cojug.modular.microbrewery.fulfillment.FulfillmentService;

public final class FulfillmentServiceImpl implements FulfillmentService
{
    public void shipBeer(String customerId, String beer, int qty)
	{
		System.out.println("Packaging up " + qty + " " + beer + " for customer id: " + customerId);
	}
}

