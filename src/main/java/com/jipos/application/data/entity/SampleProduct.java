package com.jipos.application.data.entity;


import com.jipos.application.data.AbstractEntity;

import javax.persistence.Entity;

@Entity
public class SampleProduct extends AbstractEntity {

    private int calcMethodAttribute;
    private int calcSubjectAttribute;
    private String calcSubjectName;
    private String unitSubjectCalculation;
    private String priceIntoDiscountsMargins;
    private String itemQuantity;
    private int vatTaxRate;
    private String vatAmountCalc;
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
