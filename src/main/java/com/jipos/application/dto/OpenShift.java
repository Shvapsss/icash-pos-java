package com.jipos.application.dto;

import com.google.gson.annotations.SerializedName;

public class OpenShift {
    @SerializedName("T1021")
    private String cashier;
    @SerializedName("T1203")
    private String inn;

    public OpenShift(String cashier) {
        this.cashier = cashier;
    }

    public String getCashier() {
        return cashier;
    }

    public void setCashier(String cashier) {
        this.cashier = cashier;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }
}
