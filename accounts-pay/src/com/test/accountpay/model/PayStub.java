package com.test.accountpay.model;

import com.test.payment.Beneficiary;
import com.test.payment.PayableDocument;

public class PayStub implements PayableDocument{

    private Beneficiary employee;
    private double valuePerHour;
    private int hours;

    public PayStub(Beneficiary employee, double valuePerHour, int hours) {
        this.employee = employee;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public Beneficiary getEmployee() {
        return employee;
    }


    public void setEmployee(Beneficiary employee) {
        this.employee = employee;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public double getTotalValue() {
        return getValuePerHour() * getHours();
    }

    @Override
    public Beneficiary getBeneficiary() {
        return getEmployee();
    }

}
