package com.jipos.application.data;

public enum TaxSystemEnum {
    ONE ("1","Общая"),
    TWO ("2","Упрощенная доход"),
    THREE ("3","Упрощенная доход минус расход"),
    FOUR ("4","Единый налог на вмененный доход"),
    FIVE ("5","Единый сельскохозяйственный налог"),
    SIX ("6","Патентная система налогообложения");

    private String id;
    private String title;

    TaxSystemEnum(String id, String title) {
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
