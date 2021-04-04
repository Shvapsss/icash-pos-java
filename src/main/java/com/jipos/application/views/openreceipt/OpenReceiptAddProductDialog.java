package com.jipos.application.views.openreceipt;

import com.jipos.application.data.AgentDataEnum;
import com.jipos.application.data.AgentEnum;
import com.jipos.application.data.VatEnum;
import com.jipos.application.data.entity.SampleProduct;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.Shortcuts;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextField;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CssImport("./views/openreceipt/openreceipt-view.css")
public class OpenReceiptAddProductDialog {

    public static void openProductDialog(Grid grid, List products) {
        Dialog dialog = new Dialog();
        Div contentPage1 = new Div();
        contentPage1.addClassName("product-dialog-style");

        Tab tab1 = new Tab("Основное");
        Tab tab2 = new Tab("Дополнительно");

        //Page1
        Div page1 = new Div();
        page1.add(contentPage1);
        //Page2
        Div page2 = new Div();
        page2.add(addAdditionallyProduct());
        page2.setVisible(false);

        TextField product = new TextField("Продукт:");
        TextField quantity = new TextField("Количество:", event -> {
            //TODO
            // сделать расчет суммы     summ
        });
        ComboBox<VatEnum> vat = new ComboBox<>();
        vat.setItems(Arrays.asList(VatEnum.values()));
        vat.setValue(VatEnum.ONE);
        TextField price = new TextField("Цена:", event -> {
            //TODO
            // сделать расчет суммы     summ

        });
//        TextField sum = new TextField("Сумма:");
//        sum.setEnabled(false);


        Button confirmButton = new Button("Добавить", event -> {
            SampleProduct sampleProduct = new SampleProduct();
            sampleProduct.setItemName(product.getValue());
            sampleProduct.setItemQuantity(quantity.getValue());
            sampleProduct.setPriceIntoDiscountsMargins(price.getValue());
            sampleProduct.setVatTaxRate(vat.getValue());


            products.add(sampleProduct);
            grid.setItems(products);
            dialog.close();
        });
        Button cancelButton = new Button("Отмена", event -> {
            dialog.close();
        });
        // Cancel action on ESC press
        Shortcuts.addShortcutListener(dialog, () -> {
            dialog.close();
        }, Key.ESCAPE);



        //Tab event +
        Map<Tab, Component> tabsToPages = new HashMap<>();
        tabsToPages.put(tab1, page1);
        tabsToPages.put(tab2, page2);
        Tabs tabs = new Tabs(tab1, tab2);
        Div pages = new Div(page1, page2);

        tabs.addSelectedChangeListener(event -> {
            tabsToPages.values().forEach(page -> page.setVisible(false));
            Component selectedPage = tabsToPages.get(tabs.getSelectedTab());
            selectedPage.setVisible(true);
        });


        //Tab -

        contentPage1.add(product,quantity,vat,price
                //sum,
                );
        dialog.add(tabs, pages,new Div( confirmButton, cancelButton));
        dialog.open();
    }
    private static Component addAdditionallyProduct(){
        FormLayout formAdditionallyLayout = new FormLayout();
        NumberField T1222= new NumberField("T1222");



        //TextField T1223= new TextField("T1223"); // LIST
        TextField T1073= new TextField("T1073"); //T1223A и T1223B Телефон платежного агента
        TextField T1074= new TextField("T1074"); //T1223A Телефон оператора по приему платежей
        TextField T1044= new TextField("T1044"); //T1223B Операция платежного агента
        TextField T1026= new TextField("T1026"); //T1223B Наименование оператора перевода
        TextField T1005= new TextField("T1005"); //T1223B Адрес оператора перевода
        TextField T1016= new TextField("T1016"); //T1223B ИНН оператора перевода
        TextField T1075= new TextField("T1075"); //T1223B Телефон оператора перевода

        //TextField T1224= new TextField("T1224");// LIST
        TextField T1171= new TextField("T1171"); //Телефон поставщика
        TextField T1225= new TextField("T1225"); //Наименование поставщика.


        ComboBox<AgentDataEnum> t1223T1224 = new ComboBox<>("T1057");
        t1223T1224.setItems(Arrays.asList(AgentDataEnum.values()));
        t1223T1224.addValueChangeListener(event -> {
            if(event.getValue() == AgentDataEnum.T1224){
                T1171.clear();
                T1225.clear();
                T1171.setVisible(false);
                T1225.setVisible(false);

                T1073.setVisible(true);
                T1074.setVisible(true);
                T1044.setVisible(true);
                T1026.setVisible(true);
                T1005.setVisible(true);
                T1016.setVisible(true);
                T1075.setVisible(true);
            }else {
                T1171.setVisible(true);
                T1225.setVisible(true);

                T1073.setVisible(false);
                T1074.setVisible(false);
                T1044.setVisible(false);
                T1026.setVisible(false);
                T1005.setVisible(false);
                T1016.setVisible(false);
                T1075.setVisible(false);

                T1073.clear();
                T1074.clear();
                T1044.clear();
                T1026.clear();
                T1005.clear();
                T1016.clear();
                T1075.clear();
            }

        });
        t1223T1224.setValue(AgentDataEnum.T1223);

        TextField T1226= new TextField("T1226");
        NumberField T1162= new NumberField("T1162");
        TextField T1230= new TextField("T1230");
        TextField T1231= new TextField("T1231");
        TextField T1229= new TextField("T1229");
        TextField T1191= new TextField("T1191");



        formAdditionallyLayout.add(T1222, T1073,T1074,T1044,T1026,T1005,T1016,T1075,T1171,
                t1223T1224,
                T1225,T1226,T1162,T1230,T1231,T1229,T1191);
        return formAdditionallyLayout;
    }

    private static int summ(int a, int c){
        if(a>0 && c>0) {
            return a * c;
        }else {
            return 0;
        }
    }

}
