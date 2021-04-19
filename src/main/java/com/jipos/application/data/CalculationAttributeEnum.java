package com.jipos.application.data;

public enum CalculationAttributeEnum {
    ONE (1,"Приход"),
    TWO (2,"Возврат прихода"),
    THREE (3,"Расход"),
    FOUR (4,"Возврат расхода");

    private int id;
    private String title;

    CalculationAttributeEnum(int id, String title) {
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
