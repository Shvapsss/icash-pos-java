package com.jipos.application.dto;

import com.google.gson.annotations.SerializedName;

public class Product {

    @SerializedName("T1214")
    private int calcMethodAttribute;
    @SerializedName("T1212")
    private int calcSubjectAttribute;
    @SerializedName("T1030")
    private String calcSubjectName;
    @SerializedName("T1197")
    private String unitSubjectCalculation;
    @SerializedName("T1079")
    private String priceIntoDiscountsMargins;
    @SerializedName("T1023")
    private String itemQuantity;
    @SerializedName("T1199")
    private int vatTaxRate;
    @SerializedName("T1200")
    private String vatAmountCalc;
    @SerializedName("T1043")
    private String calcSubjectIntoDiscountsMargins;

    public int getCalcMethodAttribute() {
        return calcMethodAttribute;
    }

    public void setCalcMethodAttribute(int calcMethodAttribute) {
        this.calcMethodAttribute = calcMethodAttribute;
    }

    public int getCalcSubjectAttribute() {
        return calcSubjectAttribute;
    }

    public void setCalcSubjectAttribute(int calcSubjectAttribute) {
        this.calcSubjectAttribute = calcSubjectAttribute;
    }

    public String getCalcSubjectName() {
        return calcSubjectName;
    }

    public void setCalcSubjectName(String calcSubjectName) {
        this.calcSubjectName = calcSubjectName;
    }

    public String getUnitSubjectCalculation() {
        return unitSubjectCalculation;
    }

    public void setUnitSubjectCalculation(String unitSubjectCalculation) {
        this.unitSubjectCalculation = unitSubjectCalculation;
    }

    public String getPriceIntoDiscountsMargins() {
        return priceIntoDiscountsMargins;
    }

    public void setPriceIntoDiscountsMargins(String priceIntoDiscountsMargins) {
        this.priceIntoDiscountsMargins = priceIntoDiscountsMargins;
    }

    public String getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(String itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public int getVatTaxRate() {
        return vatTaxRate;
    }

    public void setVatTaxRate(int vatTaxRate) {
        this.vatTaxRate = vatTaxRate;
    }

    public String getVatAmountCalc() {
        return vatAmountCalc;
    }

    public void setVatAmountCalc(String vatAmountCalc) {
        this.vatAmountCalc = vatAmountCalc;
    }

    public String getCalcSubjectIntoDiscountsMargins() {
        return calcSubjectIntoDiscountsMargins;
    }

    public void setCalcSubjectIntoDiscountsMargins(String calcSubjectIntoDiscountsMargins) {
        this.calcSubjectIntoDiscountsMargins = calcSubjectIntoDiscountsMargins;
    }
}
