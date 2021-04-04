package com.jipos.application.data.entity;

import javax.persistence.Entity;

import com.jipos.application.data.AbstractEntity;

import java.util.List;

@Entity
public class SampleReceipt extends AbstractEntity {

    private int calcAttribute;                              //T1054 * int Enum
    private int taxSystem;                                  //T1055 * int Enum
    private String T1227;                                   //T1227 - String
    private String T1228;                                   //T1228  - String
    private String T1008;                                   //T1008  - String
    private String T1036;                                   //T1036  - String
    //private List<String> T1059;                                   //T1059 (* one ++) --> SampleProduct {massive}
    private String amountReceipt;                           //T1020 *  - String
    private String amountCashReceipt;                       //T1031 *  - String
    private String amountElectronReceipt;                   //T1081 *  - String
    private String T1215;                                   //T1215 - String
    private String T1216;                                   //T1216 - String
    private String T1217;                                   //T1217 - String
    private String T1102;                                   //T1102 - String
    private String T1103;                                   //T1103 - String
    private String T1104;                                   //T1104 - String
    private String T1105;                                   //T1105 - String
    private String T1106;                                   //T1106 - String
    private String T1107;                                   //T1107 - String
    private int T1057;                                      //T1057 - int Enum
    private String T1075;                                   //T1075 - String
    private String T1044;                                   //T1044 - String
    private String T1073;                                   //T1073 - String
    private String T1074;                                   //T1074 - String
    private String T1026;                                   //T1026 - String
    private String T1005;                                   //T1005 - String
    private String T1016;                                   //T1016 - String
    private String T1171;                                   //T1171 - String
    private String T1192;                                   //T1192 - String
    private String T1084;                                   //T1084
    private String T1085;                                   //T1085
    private String T1086;                                   //T1086
    private String cashier;                                 //T1021 *    - String
    private String T1203;                                   //T1203      - String


    public String getT1227() {
        return T1227;
    }

    public void setT1227(String t1227) {
        T1227 = t1227;
    }

    public String getT1228() {
        return T1228;
    }

    public void setT1228(String t1228) {
        T1228 = t1228;
    }

    public String getT1008() {
        return T1008;
    }

    public void setT1008(String t1008) {
        T1008 = t1008;
    }

    public String getT1036() {
        return T1036;
    }

    public void setT1036(String t1036) {
        T1036 = t1036;
    }

    public String getT1215() {
        return T1215;
    }

    public void setT1215(String t1215) {
        T1215 = t1215;
    }

    public String getT1216() {
        return T1216;
    }

    public void setT1216(String t1216) {
        T1216 = t1216;
    }

    public String getT1217() {
        return T1217;
    }

    public void setT1217(String t1217) {
        T1217 = t1217;
    }

    public String getT1102() {
        return T1102;
    }

    public void setT1102(String t1102) {
        T1102 = t1102;
    }

    public String getT1103() {
        return T1103;
    }

    public void setT1103(String t1103) {
        T1103 = t1103;
    }

    public String getT1104() {
        return T1104;
    }

    public void setT1104(String t1104) {
        T1104 = t1104;
    }

    public String getT1105() {
        return T1105;
    }

    public void setT1105(String t1105) {
        T1105 = t1105;
    }

    public String getT1106() {
        return T1106;
    }

    public void setT1106(String t1106) {
        T1106 = t1106;
    }

    public String getT1107() {
        return T1107;
    }

    public void setT1107(String t1107) {
        T1107 = t1107;
    }

    public int getT1057() {
        return T1057;
    }

    public void setT1057(int t1057) {
        T1057 = t1057;
    }

    public String getT1075() {
        return T1075;
    }

    public void setT1075(String t1075) {
        T1075 = t1075;
    }

    public String getT1044() {
        return T1044;
    }

    public void setT1044(String t1044) {
        T1044 = t1044;
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

    public String getT1171() {
        return T1171;
    }

    public void setT1171(String t1171) {
        T1171 = t1171;
    }

    public String getT1192() {
        return T1192;
    }

    public void setT1192(String t1192) {
        T1192 = t1192;
    }

    public String getT1084() {
        return T1084;
    }

    public void setT1084(String t1084) {
        T1084 = t1084;
    }

    public String getT1085() {
        return T1085;
    }

    public void setT1085(String t1085) {
        T1085 = t1085;
    }

    public String getT1086() {
        return T1086;
    }

    public void setT1086(String t1086) {
        T1086 = t1086;
    }

    public String getT1203() {
        return T1203;
    }

    public void setT1203(String t1203) {
        T1203 = t1203;
    }

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
