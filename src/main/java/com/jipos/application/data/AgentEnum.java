package com.jipos.application.data;

public enum AgentEnum {
    ONE ("1","Оказание услуг покупателю (клиенту) пользователем, являющимся банковским платежным агентом банковским платежным агентом"),
    TWO ("2","Оказание услуг покупателю (клиенту) пользователем, являющимся банковским платежным агентом банковским платежным субагентом"),
    THREE ("3","Оказание услуг покупателю (клиенту) пользователем, являющимся платежным агентом"),
    FOUR ("4","Оказание услуг покупателю (клиенту) пользователем, являющимся платежным субагентом"),
    FIVE ("5","Осуществление расчета с покупателем (клиентом) пользователем, являющимся поверенным"),
    SIX ("6","Осуществление расчета с покупателем (клиентом) пользователем, являющимся комиссионером"),
    SEVEN ("7","Осуществление расчета с покупателем (клиентом) пользователем, являющимся агентом и не являющимся банковским платежным агентом (субагентом), платежным агентом (субагентом), поверенным, комиссионером");


    private String id;
    private String title;

    AgentEnum(String id, String title) {
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
