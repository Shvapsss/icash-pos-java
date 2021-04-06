package com.jipos.application.data.entity;


import com.jipos.application.data.AbstractEntity;
import com.jipos.application.data.VatEnum;

import javax.persistence.Entity;

@Entity
public class SampleProduct extends AbstractEntity {
    //Основные теги
    private int T1214;                              //T1214 *
    private int T1212;                              //T1212 *
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
    private String T1030;                           //T1030 *
    private String T1197;                           //T1197 *
    private int T1162;                              //T1162 INT + ENUM
    private String T1230;                           //T1230
    private String T1231;                           //T1231
    private String T1079;                           //T1079 *
    private String T1023;                           //T1023 *
    private String T1229;                          //T1229
    private VatEnum T1199;                         //T1199 *
    private String T1200;                           //T1200 *
    private String T1043;                           //T1043 *
    private String T1191;                           //T1191

    public SampleProduct(String t1030, String t1079, String t1023, VatEnum t1199, String t1043) {
//        T1214 = t1214;
//        T1212 = t1212;
        T1030 = t1030;
        T1079 = t1079;
        T1023 = t1023;
        T1199 = t1199;
        T1043 = t1043;
    }

    public int getT1214() {
        return T1214;
    }

    public void setT1214(int t1214) {
        this.T1214 = t1214;
    }

    public int getT1212() {
        return T1212;
    }

    public void setT1212(int t1212) {
        this.T1212 = t1212;
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

    public String getT1030() {
        return T1030;
    }

    public void setT1030(String t1030) {
        this.T1030 = t1030;
    }

    public String getT1197() {
        return T1197;
    }

    public void setT1197(String t1197) {
        this.T1197 = t1197;
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

    public String getT1079() {
        return T1079;
    }

    public void setT1079(String t1079) {
        this.T1079 = t1079;
    }

    public String getT1023() {
        return T1023;
    }

    public void setT1023(String t1023) {
        this.T1023 = t1023;
    }

    public String getT1229() {
        return T1229;
    }

    public void setT1229(String t1229) {
        T1229 = t1229;
    }

    public VatEnum getT1199() {
        return T1199;
    }

    public void setT1199(VatEnum t1199) {
        this.T1199 = t1199;
    }

    public String getT1200() {
        return T1200;
    }

    public void setT1200(String t1200) {
        this.T1200 = t1200;
    }

    public String getT1043() {
        return T1043;
    }

    public void setT1043(String t1043) {
        this.T1043 = t1043;
    }

    public String getT1191() {
        return T1191;
    }

    public void setT1191(String t1191) {
        T1191 = t1191;
    }
}
