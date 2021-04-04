package com.jipos.application.data.entity;


import com.jipos.application.data.AbstractEntity;
import com.jipos.application.data.VatEnum;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class SampleProduct extends AbstractEntity {
    //Основные теги
    private int calcMethodAttribute;                //T1214 *
    private int calcSubjectAttribute;               //T1212 *
    private int T1222;                              //T1222 - int ENUM 7
    //private List<String> T1223;                     //T1223 {}
    private String T1073;                                //T1073 - String
    private String T1074;                                //T1074 - String
    private String T1044;                                //T1044 - String
    private String T1026;                                //T1026 - String
    private String T1005;                                //T1005 - String
    private String T1016;                                //T1016 - String
    private String T1075;                                //T1075 - String
    //private List<String> T1224;                     //T1224 List<String> {}
    private String T1171;                                //T1171 - String
    private String T1225;                                //T1225 - String
    private String T1226;                           //T1226
    private String itemName;                        //T1030 *
    private String unitSubjectCalculation;          //T1197 *
    private int T1162;                              //T1162 INT + ENUM
    private String T1230;                           //T1230
    private String T1231;                           //T1231
    private String priceIntoDiscountsMargins;       //T1079 *
    private String itemQuantity;                    //T1023 *
    private String T1229;                          //T1229
    private VatEnum vatTaxRate;                         //T1199 *
    private String vatAmountCalc;                   //T1200 *
    private String calcSubjectIntoDiscountsMargins; //T1043 *
    private String T1191;                           //T1191

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

    public int getT1222() {
        return T1222;
    }

    public void setT1222(int t1222) {
        T1222 = t1222;
    }


    public String getT1073() {
        return T1073;
    }

    public void setT1073(String t1073) {
        T1073 = t1073;
    }

    public String getT1074() {
        return T1074;
    }

    public void setT1074(String t1074) {
        T1074 = t1074;
    }

    public String getT1044() {
        return T1044;
    }

    public void setT1044(String t1044) {
        T1044 = t1044;
    }

    public String getT1026() {
        return T1026;
    }

    public void setT1026(String t1026) {
        T1026 = t1026;
    }

    public String getT1005() {
        return T1005;
    }

    public void setT1005(String t1005) {
        T1005 = t1005;
    }

    public String getT1016() {
        return T1016;
    }

    public void setT1016(String t1016) {
        T1016 = t1016;
    }

    public String getT1075() {
        return T1075;
    }

    public void setT1075(String t1075) {
        T1075 = t1075;
    }


    public String getT1171() {
        return T1171;
    }

    public void setT1171(String t1171) {
        T1171 = t1171;
    }

    public String getT1225() {
        return T1225;
    }

    public void setT1225(String t1225) {
        T1225 = t1225;
    }

    public String getT1226() {
        return T1226;
    }

    public void setT1226(String t1226) {
        T1226 = t1226;
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

    public int getT1162() {
        return T1162;
    }

    public void setT1162(int t1162) {
        T1162 = t1162;
    }

    public String getT1230() {
        return T1230;
    }

    public void setT1230(String t1230) {
        T1230 = t1230;
    }

    public String getT1231() {
        return T1231;
    }

    public void setT1231(String t1231) {
        T1231 = t1231;
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

    public String getT1229() {
        return T1229;
    }

    public void setT1229(String t1229) {
        T1229 = t1229;
    }

    public VatEnum getVatTaxRate() {
        return vatTaxRate;
    }

    public void setVatTaxRate(VatEnum vatTaxRate) {
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

    public String getT1191() {
        return T1191;
    }

    public void setT1191(String t1191) {
        T1191 = t1191;
    }
}
