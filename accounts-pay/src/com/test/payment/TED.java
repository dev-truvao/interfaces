package com.test.payment;

public class TED implements PaymentMethod{
    
    @Override
    public void pay(PayableDocument doc) {
        
        Beneficiary beneficiary = doc.getBeneficiary();
		
		if(beneficiary.hasntAccount()) {
			throw new RuntimeException(
					"Beneficiary does not have a Account");
		}
		
		System.out.printf(
				"DEBUG: Making a transfer to %s in the amount of $ %.2f, "
				+ "with the account %s.%n", beneficiary.getName(), 
				doc.getTotalValue(), beneficiary.getAccount());
	} 
}
