package com.jipos.application.data.entity;


import com.jipos.application.data.AbstractEntity;
import com.jipos.application.data.VatEnum;

//@Entity
public class SampleProduct extends AbstractEntity {
    //Основные теги
    private int t1214;                              //T1214 *
    private int t1212;                              //T1212 *
    private int t1222;                              //T1222 - int ENUM 7
    //Если енам выбран T1223 тогда поле заполнить тайтлом из этого енама
    //private List<String> T1223;                     //T1223 {}
    private String t1073;                                //T1073 - String
    private String t1074;                                //T1074 - String
    private String t1044;                                //T1044 - String
    private String t1026;                                //T1026 - String
    private String t1005;                                //T1005 - String
    private String t1016;                                //T1016 - String
    private String t1075;                                //T1075 - String
    //Если енам выбран T1223 тогда поле заполнить тайтлом из этого енама
    //private List<String> T1224;                     //T1224 List<String> {}
    private String t1171;                                //T1171 - String
    private String t1225;                                //T1225 - String
    private String t1226;                           //T1226
    private String t1030;                           //T1030 *
    private String t1197;                           //T1197 *
    private int t1162;                              //T1162 INT + ENUM
    private String t1230;                           //T1230
    private String t1231;                           //T1231
    private String t1079;                           //T1079 *
    private String T1023;                           //T1023 *
    private String t1229;                          //T1229
    private int t1199;                         //T1199 *
    private String t1200;                           //T1200 *
    private String t1043;                           //T1043 *
    private String t1191;                           //T1191

    public SampleProduct(String t1030, String t1079, String t1023, int t1199, String t1043) {
//        T1214 = t1214;
//        T1212 = t1212;
        this.t1030 = t1030;
        this.t1079 = t1079;
        T1023 = t1023;
        this.t1199 = t1199;
        this.t1043 = t1043;
    }

    public int getT1214() {
        return t1214;
    }

    public void setT1214(int t1214) {
        this.t1214 = t1214;
    }

    public int getT1212() {
        return t1212;
    }

    public void setT1212(int t1212) {
        this.t1212 = t1212;
    }

    public int getT1222() {
        return t1222;
    }

    public void setT1222(int t1222) {
        this.t1222 = t1222;
    }


    public String getT1073() {
        return t1073;
    }

    public void setT1073(String t1073) {
        this.t1073 = t1073;
    }

    public String getT1074() {
        return t1074;
    }

    public void setT1074(String t1074) {
        this.t1074 = t1074;
    }

    public String getT1044() {
        return t1044;
    }

    public void setT1044(String t1044) {
        this.t1044 = t1044;
    }

    public String getT1026() {
        return t1026;
    }

    public void setT1026(String t1026) {
        this.t1026 = t1026;
    }

    public String getT1005() {
        return t1005;
    }

    public void setT1005(String t1005) {
        this.t1005 = t1005;
    }

    public String getT1016() {
        return t1016;
    }

    public void setT1016(String t1016) {
        this.t1016 = t1016;
    }

    public String getT1075() {
        return t1075;
    }

    public void setT1075(String t1075) {
        this.t1075 = t1075;
    }


    public String getT1171() {
        return t1171;
    }

    public void setT1171(String t1171) {
        this.t1171 = t1171;
    }

    public String getT1225() {
        return t1225;
    }

    public void setT1225(String t1225) {
        this.t1225 = t1225;
    }

    public String getT1226() {
        return t1226;
    }

    public void setT1226(String t1226) {
        this.t1226 = t1226;
    }

    public String getT1030() {
        return t1030;
    }

    public void setT1030(String t1030) {
        this.t1030 = t1030;
    }

    public String getT1197() {
        return t1197;
    }

    public void setT1197(String t1197) {
        this.t1197 = t1197;
    }

    public int getT1162() {
        return t1162;
    }

    public void setT1162(int t1162) {
        this.t1162 = t1162;
    }

    public String getT1230() {
        return t1230;
    }

    public void setT1230(String t1230) {
        this.t1230 = t1230;
    }

    public String getT1231() {
        return t1231;
    }

    public void setT1231(String t1231) {
        this.t1231 = t1231;
    }

    public String getT1079() {
        return t1079;
    }

    public void setT1079(String t1079) {
        this.t1079 = t1079;
    }

    public String getT1023() {
        return T1023;
    }

    public void setT1023(String t1023) {
        this.T1023 = t1023;
    }

    public String getT1229() {
        return t1229;
    }

    public void setT1229(String t1229) {
        this.t1229 = t1229;
    }

    public int getT1199() {
        return t1199;
    }

    public void setT1199(int t1199) {
        this.t1199 = t1199;
    }

    public String getT1200() {
        return t1200;
    }

    public void setT1200(String t1200) {
        this.t1200 = t1200;
    }

    public String getT1043() {
        return t1043;
    }

    public void setT1043(String t1043) {
        this.t1043 = t1043;
    }

    public String getT1191() {
        return t1191;
    }

    public void setT1191(String t1191) {
        this.t1191 = t1191;
    }
}
