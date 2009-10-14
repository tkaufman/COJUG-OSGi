package org.cojug.modular.microbrewery.consumer.internal;

import org.cojug.modular.microbrewery.order.OrderService;
 
public class ThirstyConsumer { 

	private OrderService orderService;

	public ThirstyConsumer(OrderService svc) {
		orderService = svc;
	}

	public void start() throws Exception { 
		System.out.println("I'm thirsty!"); 
		if (orderService != null) {
			orderService.orderBeer("Schlitz", 6);
		}
		else {
			System.out.println("Order Service is null, Houston we have a problem!");
		}
	} 

	public void stop() { 
		System.out.println("Buuuuuurrrrpppp!"); 
	} 

} 
