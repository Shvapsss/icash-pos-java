package com.jipos.application.data;

public enum VatEnum {
    ONE (1,"НДС 20%"),
    TWO (2,"НДС 10%"),
    THREE (3,"НДС расч. 18/118"),
    FOUR (4,"НДС расч. 10/110"),
    FIVE (5,"НДС 0%"),
    SIX (6,"НДС не облагается");


    private int id;
    private String title;

    VatEnum(int id, String title) {
        this.id = id;
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return getTitle();
    }
}
