package com.jipos.application.data;

public enum CalculationAttributeEnum {
    ONE ("1","Приход"),
    TWO ("2","Возврат прихода"),
    THREE ("3","Расход"),
    FOUR ("4","Возврат расхода");

    private String id;
    private String title;

    CalculationAttributeEnum(String id, String title) {
        this.id = id;
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return getTitle();
    }
}
