package com.jipos.application.data.entity;

import com.jipos.application.data.AbstractEntity;

import javax.persistence.Entity;

@Entity
public class SampleReceipt extends AbstractEntity {

    private int calcAttribute;
    private int taxSystem;
    private int cashier;
    private int amountReceipt;
    private int amountCashReceipt;
    private int amountElectronReceipt;

    public int getCalcAttribute() {
        return calcAttribute;
    }

    public void setCalcAttribute(int calcAttribute) {
        this.calcAttribute = calcAttribute;
    }

    public int getTaxSystem() {
        return taxSystem;
    }

    public void setTaxSystem(int taxSystem) {
        this.taxSystem = taxSystem;
    }

    public int getCashier() {
        return cashier;
    }

    public void setCashier(int cashier) {
        this.cashier = cashier;
    }

    public int getAmountReceipt() {
        return amountReceipt;
    }

    public void setAmountReceipt(int amountReceipt) {
        this.amountReceipt = amountReceipt;
    }

    public int getAmountCashReceipt() {
        return amountCashReceipt;
    }

    public void setAmountCashReceipt(int amountCashReceipt) {
        this.amountCashReceipt = amountCashReceipt;
    }

    public int getAmountElectronReceipt() {
        return amountElectronReceipt;
    }

    public void setAmountElectronReceipt(int amountElectronReceipt) {
        this.amountElectronReceipt = amountElectronReceipt;
    }
}
