package org.cojug.modular.microbrewery.billing.internal

import org.cojug.modular.microbrewery.billing.BillingService

class BillingServiceUselessImpl implements BillingService {

    void bill(String customerId, BigDecimal amount) {
		println("Looking up customer")
		println("Sending payment of ${amount}")
	}
	
	void credit(String customerId, BigDecimal amount) {
		println("Looking up customer")
		println("Sending a credit of ${amount}")
	}

}