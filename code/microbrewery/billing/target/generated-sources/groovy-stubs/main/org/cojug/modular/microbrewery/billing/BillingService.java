//
// Generated stub from file:/Users/toddkaufman/Source/java/osgi/cojug-demo/5-SpringDM/microbrewery/billing/src/main/groovy/org/cojug/modular/microbrewery/billing/BillingService.groovy
//

package org.cojug.modular.microbrewery.billing;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public interface BillingService
{
    void bill(java.lang.String customerId, BigDecimal amount);

    void credit(java.lang.String customerId, BigDecimal amount);
}
