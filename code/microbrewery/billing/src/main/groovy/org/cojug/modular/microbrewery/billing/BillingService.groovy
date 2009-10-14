package org.cojug.modular.microbrewery.billing

interface BillingService {

    void bill(String customerId, BigDecimal amount)
	
	void credit(String customerId, BigDecimal amount)

}
