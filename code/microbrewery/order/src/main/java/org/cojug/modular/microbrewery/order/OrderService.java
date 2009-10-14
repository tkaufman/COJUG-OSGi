package org.cojug.modular.microbrewery.order; 

import java.util.*;

public interface OrderService { 

	void orderBeer(String name, int qty) throws Exception; 

	Map<String, Integer> availableBeers(); 

} 
