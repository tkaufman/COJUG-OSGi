package org.cojug.modular.microbrewery.order.internal; 

import org.cojug.modular.microbrewery.order.OrderService;

import org.cojug.modular.microbrewery.billing.BillingService;

import org.cojug.modular.microbrewery.fulfillment.FulfillmentService;

import java.math.BigDecimal;
import java.util.*;

public class HashBasedOrderServiceImpl implements OrderService { 

	private Map<String, Integer> stock = new HashMap<String, Integer>();
	private BillingService billingService;
	private FulfillmentService fulfillService;
	
	public HashBasedOrderServiceImpl(BillingService billSvc, FulfillmentService fulfillSvc) {
		billingService = billSvc;
		fulfillService = fulfillSvc;

		stock.put("Schlitz", 12);
		stock.put("Sierra Nevada", 12);
		stock.put("PBR", 6);
		stock.put("Duvel", 4);
		stock.put("Oberon", 12);
	}
	
	public void orderBeer(String name, int qty) throws Exception {
		if (stock.containsKey(name) && stock.get(name) >= qty) {
			int newStock = stock.get(name) - qty;
			stock.put(name, newStock);
			
			// Lookup customer id?
			String customerId = name + "1";
			BigDecimal total = new BigDecimal(qty * 1);
			billEm(customerId, total);
			shipIt(customerId, name, qty);
		}
		else {
			throw new Exception ("Cannot complete order due to lack of inventory");
		}
	} 

	public Map<String, Integer> availableBeers() {
		return stock;
	}

	private void billEm(String customerId, BigDecimal total) {
		billingService.bill(customerId, total);
	}

	private void shipIt(String customerId, String name, int qty) {
		fulfillService.shipBeer(customerId, name, qty);
	}

}