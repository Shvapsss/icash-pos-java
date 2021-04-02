package com.jipos.application.data.entity;

import javax.persistence.Entity;

import com.jipos.application.data.AbstractEntity;
@Entity
public class SampleReceipt extends AbstractEntity {

    private int calcAttribute;                 //T1054
    private int taxSystem;                     //T1055
    private String cashier;                    //T1021
    private String amountReceipt;              //T1020
    private String amountCashReceipt;          //T1031
    private String amountElectronReceipt;      //T1081


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

    public String getCashier() {
        return cashier;
    }

    public void setCashier(String cashier) {
        this.cashier = cashier;
    }

    public String getAmountReceipt() {
        return amountReceipt;
    }

    public void setAmountReceipt(String amountReceipt) {
        this.amountReceipt = amountReceipt;
    }

    public String getAmountCashReceipt() {
        return amountCashReceipt;
    }

    public void setAmountCashReceipt(String amountCashReceipt) {
        this.amountCashReceipt = amountCashReceipt;
    }

    public String getAmountElectronReceipt() {
        return amountElectronReceipt;
    }

    public void setAmountElectronReceipt(String amountElectronReceipt) {
        this.amountElectronReceipt = amountElectronReceipt;
    }
}
