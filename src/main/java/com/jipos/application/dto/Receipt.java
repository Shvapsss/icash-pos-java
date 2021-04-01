package com.jipos.application.dto;

import com.google.gson.annotations.SerializedName;

public class Receipt {

    @SerializedName("T1054")
    private int calcAttribute;
    @SerializedName("T1055")
    private int taxSystem;
    @SerializedName("T1021")
    private int cashier;
    @SerializedName("T1020")
    private int amountReceipt;
    @SerializedName("T1031")
    private int amountCashReceipt;
    @SerializedName("T1081")
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
