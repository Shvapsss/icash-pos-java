package com.jipos.application.data;

public enum AgentDataEnum {
    T1223 ("Агент"),
    T1224 ("Банковский агент");

    private String title;

    AgentDataEnum(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    @Override
    public String toString() {
        return getTitle();
    }
}
