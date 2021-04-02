package com.jipos.application.dto;

import com.google.gson.annotations.SerializedName;

public class Receipt {

    @SerializedName("T1054")
    private int calcAttribute;
    @SerializedName("T1055")
    private int taxSystem;
    @SerializedName("T1021")
    private String cashier;
    @SerializedName("T1020")
    private String amountReceipt;
    @SerializedName("T1031")
    private String amountCashReceipt;
    @SerializedName("T1081")
    private String amountElectronReceipt;

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
