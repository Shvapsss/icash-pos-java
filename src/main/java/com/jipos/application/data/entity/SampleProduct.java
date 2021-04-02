package com.jipos.application.data.entity;


import com.google.gson.annotations.SerializedName;
import com.jipos.application.data.AbstractEntity;

import javax.persistence.Entity;

@Entity
public class SampleProduct extends AbstractEntity {

    private String itemName; //T1030
    private String itemQuantity; //T1023
    private String priceIntoDiscountsMargins; //T1079
    private int vatTaxRate;//T1199
    private String unitSubjectCalculation; //T1197
    private int calcMethodAttribute; //T1214
    private int calcSubjectAttribute; //T1212
    private String vatAmountCalc;//T1200
    private String calcSubjectIntoDiscountsMargins;//T1043


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

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
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
