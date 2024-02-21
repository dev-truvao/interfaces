package com.test.accountpay.model;

import com.test.payment.Beneficiary;
import com.test.payment.PayableDocument;

public class ServiceOrder implements PayableDocument{

    private Beneficiary supplier;
    private double totalValue;

    public ServiceOrder(Beneficiary supplier, double totalValue) {
        this.supplier = supplier;
        this.totalValue = totalValue;
    }

    public Beneficiary getSupplier() {
        return supplier;
    }

    public void setSupplier(Beneficiary supplier) {
        this.supplier = supplier;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    @Override
    public double getTotalValue() {
        return totalValue;
    }

    @Override
    public Beneficiary getBeneficiary() {
        return supplier;
    }
    
}
