package com.jipos.application.dto;

import com.google.gson.annotations.SerializedName;

public  class  FiscalAccumulator {
    private boolean ok;
    @SerializedName("fiscal_drive_number")
    private String fiscalDriveNumber;
    private int state;
    @SerializedName("document_code")
    private int documentCode;
    @SerializedName("document_data_status")
    private int documentDataStatus;
    @SerializedName("shift_status")
    private int shiftStatus;
    @SerializedName("alert_flags")
    private int alertFlags;
    @SerializedName("last_document_datetime")
    private String lastDocumentDatetime;
    @SerializedName("last_document_number")
    private int lastDocumentNumber;

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public String getFiscalDriveNumber() {
        return fiscalDriveNumber;
    }

    public void setFiscalDriveNumber(String fiscalDriveNumber) {
        this.fiscalDriveNumber = fiscalDriveNumber;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getDocumentCode() {
        return documentCode;
    }

    public void setDocumentCode(int documentCode) {
        this.documentCode = documentCode;
    }

    public int getDocumentDataStatus() {
        return documentDataStatus;
    }

    public void setDocumentDataStatus(int documentDataStatus) {
        this.documentDataStatus = documentDataStatus;
    }

    public int getShiftStatus() {
        return shiftStatus;
    }

    public void setShiftStatus(int shiftStatus) {
        this.shiftStatus = shiftStatus;
    }

    public int getAlertFlags() {
        return alertFlags;
    }

    public void setAlertFlags(int alertFlags) {
        this.alertFlags = alertFlags;
    }

    public String getLastDocumentDatetime() {
        return lastDocumentDatetime;
    }

    public void setLastDocumentDatetime(String lastDocumentDatetime) {
        this.lastDocumentDatetime = lastDocumentDatetime;
    }

    public int getLastDocumentNumber() {
        return lastDocumentNumber;
    }

    public void setLastDocumentNumber(int lastDocumentNumber) {
        this.lastDocumentNumber = lastDocumentNumber;
    }


    @Override
    public String toString() {
        return ("ok:"+ok+"Fiscal:"+fiscalDriveNumber+" LastDocDate:"+lastDocumentDatetime);
    }
}
