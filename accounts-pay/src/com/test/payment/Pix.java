package com.test.payment;

public class Pix implements PaymentMethod{

    @Override
    public void pay(PayableDocument doc) {
        
        Beneficiary beneficiary = doc.getBeneficiary();
		
		if(beneficiary.hasntPix()) {
			throw new RuntimeException(
					"Beneficiary does not have a Pix key");
		}
		
		System.out.printf(
				"DEBUG: Making pix to %s in the amount of $ %.2f, "
				+ "with the key %s.%n", beneficiary.getName(), 
				doc.getTotalValue(), beneficiary.getPix());
	} 
}
