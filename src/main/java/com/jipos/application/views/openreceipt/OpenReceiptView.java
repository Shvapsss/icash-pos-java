package com.jipos.application.views.openreceipt;

import com.google.gson.Gson;
import com.jipos.application.data.CalculationAttributeEnum;
import com.jipos.application.data.TaxSystemEnum;
import com.jipos.application.data.entity.SampleProduct;
import com.jipos.application.data.AgentEnum;
import com.jipos.application.data.entity.SampleReceipt;
import com.jipos.application.views.main.MainView;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.provider.ListDataProvider;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.component.dependency.CssImport;

import java.util.*;

@Route(value = "open-receipt", layout = MainView.class)
@PageTitle("Кассовый чек (БСО)")
@CssImport("./views/openreceipt/openreceipt-view.css")
public class OpenReceiptView extends Div {

    private ComboBox<CalculationAttributeEnum> t1054 = new ComboBox<>();
    private ComboBox<TaxSystemEnum> t1055 = new ComboBox<>();

    private TextField t1021 = new TextField("Кассир");
    private TextField t1020 = new TextField("Сумма чека");
    private TextField t1031 = new TextField("Сумма чека наличными");
    private TextField t1081 = new TextField("Сумма чека электронными");


    ///DOPOLNITELNO
    TextField t1227 = new TextField("T1227");
    TextField t1228 = new TextField("T1228");
    TextField t1008 = new TextField("T1008");
    TextField t1036 = new TextField("T1036");
    TextField t1215 = new TextField("T1215");
    TextField t1216 = new TextField("T1216");
    TextField t1217 = new TextField("T1217");
    TextField t1102 = new TextField("T1102");
    TextField t1103 = new TextField("T1103");
    TextField t1104 = new TextField("T1104");
    TextField t1105 = new TextField("T1105");
    TextField t1106 = new TextField("T1106");
    TextField t1107 = new TextField("T1107");
    ComboBox<AgentEnum> t1057 = new ComboBox<>("T1057");
    TextField t1075 = new TextField("T1075");
    TextField t1044 = new TextField("T1044");
    TextField t1073 = new TextField("T1073");
    TextField t1074 = new TextField("T1074");
    TextField t1026 = new TextField("T1026");
    TextField t1005 = new TextField("T1005");
    TextField t1016 = new TextField("T1016");
    TextField t1171 = new TextField("T1171");
    TextField t1192 = new TextField("T1192");
    TextField t1084 = new TextField("T1084");
    TextField t1085 = new TextField("T1085");
    TextField t1086 = new TextField("T1086");
    TextField t1203 = new TextField("T1203");

//    private Button cancel = new Button("Cancel");
    private Button addButton = new Button("Добавить продукт");
    private Button save = new Button("Печать");

//    private Binder<SampleReceipt> binder = new Binder(SampleReceipt.class);

//    public OpenReceiptView(SampleReceiptService receiptService) {
    public OpenReceiptView() {
        addClassName("openreceipt-view");
        t1054.isRequired();
        t1055.isRequired();
        t1021.isRequired();
        t1020.isRequired();
        t1031.isRequired();
        t1081.isRequired();
        t1054.setItems(Arrays.asList(CalculationAttributeEnum.values()));
        t1054.setValue(CalculationAttributeEnum.ONE);
        t1055.setItems(Arrays.asList(TaxSystemEnum.values()));
        t1055.setValue(TaxSystemEnum.ONE);
        //T1059 = grid
        Grid grid = createMainProductGrid();
        List<SampleProduct> products = new ArrayList<>();
        Tab tab1 = new Tab("Основное");
        Tab tab2 = new Tab("Дополнительно");

        //Page1
        Div page1 = new Div();
        page1.add(createFormLayout());
        page1.add(grid);
        page1.add(createButtonLayout());
        //Page2
        Div page2 = new Div();
        page2.add(addAdditionallyReceipt());
        page2.setVisible(false);

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

        add(createTitle(),tabs, pages);
        //Tab -

//        binder.bindInstanceFields(this);
//        clearForm();
//        cancel.addClickListener(e -> clearForm());
        save.addClickListener(e -> {
//            receiptService.update(binder.getBean());
//            Notification.show(binder.getBean().getClass().getSimpleName() + " details stored.");
//            clearForm();
            String json = getJson(products);
            products.forEach(product -> Notification.show(
                    product.getT1030()));
            Notification.show("Отправить чек на печать");
        });
        addButton.addClickListener(e -> {
            OpenReceiptAddProductDialog.openProductDialog(grid,products);

        });
    }
//    private void clearForm() {
//        binder.setBean(new SampleReceipt());
//    }


    ////Work in grid
    ////grid.setItems(products);
    private String getJson(List<SampleProduct> products){
        SampleReceipt sampleReceipt = new SampleReceipt(t1054.getValue().getId(),t1055.getValue().getId(),t1020.getTitle(),t1031.getTitle(),t1081.getTitle(),t1021.getTitle());

        sampleReceipt.setT1059(products);
        Gson gson = new Gson();
        return gson.toJson(sampleReceipt);
    }
    private Component addAdditionallyReceipt(){
        FormLayout formAdditionallyLayout = new FormLayout();
        t1057.setItems(Arrays.asList(AgentEnum.values()));
        formAdditionallyLayout.add(t1227, t1228, t1008, t1036, t1215, t1216, t1217, t1102, t1103, t1104, t1105, t1106, t1107, t1057, t1075, t1044, t1073, t1074, t1026, t1005, t1016, t1171, t1192, t1084, t1085, t1086, t1203);
        return formAdditionallyLayout;
    }

    private Component createTitle() {
        return new H3("Кассовый чек (БСО)");
    }
    private Grid createMainProductGrid() {
        Grid<SampleProduct> grid = new Grid<>();
        //grid.setColumns("itemName", "itemQuantity", "priceIntoDiscountsMargins", "vatTaxRate");
        grid.addColumn(SampleProduct::getT1030).setHeader("Продукт");
        grid.addColumn(SampleProduct::getT1023).setHeader("Количество");
        grid.addColumn(SampleProduct::getT1199).setHeader("НДС");
        grid.addColumn(SampleProduct::getT1079).setHeader("Цена");
        grid.addColumn(SampleProduct::getT1043).setHeader("Сумма");
        // Or you can use an ordinary function to setup the component
        grid.addComponentColumn(item -> createRemoveButton(grid, item))
                .setHeader("Действие");
        return grid;
    }

    private Component createFormLayout() {
        FormLayout formLayout = new FormLayout();
        formLayout.add(t1054, t1055, t1021, t1020, t1031, t1081);
        return formLayout;
    }


    private Component createButtonLayout() {
        HorizontalLayout buttonLayout = new HorizontalLayout();
        buttonLayout.addClassName("button-layout");
        save.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonLayout.add(save);
//        buttonLayout.add(cancel);
        buttonLayout.add(addButton);
        return buttonLayout;
    }

    private Button createRemoveButton(Grid<SampleProduct> grid, SampleProduct item) {
        @SuppressWarnings("unchecked")
        Button button = new Button("Убрать", clickEvent -> {
            ListDataProvider<SampleProduct> dataProvider = (ListDataProvider<SampleProduct>) grid
                    .getDataProvider();
            dataProvider.getItems().remove(item);
            dataProvider.refreshAll();
        });
        return button;
    }
//    private static class PhoneNumberField extends CustomField<String> {
//        private ComboBox<String> countryCode = new ComboBox<>();
//        private TextField number = new TextField();
//
//        public PhoneNumberField(String label) {
//            setLabel(label);
//            countryCode.setWidth("120px");
//            countryCode.setPlaceholder("Country");
//            countryCode.setPattern("\\+\\d*");
//            countryCode.setPreventInvalidInput(true);
//            countryCode.setItems("+354", "+91", "+62", "+98", "+964", "+353", "+44", "+972", "+39", "+225");
//            countryCode.addCustomValueSetListener(e -> countryCode.setValue(e.getDetail()));
//            number.setPattern("\\d*");
//            number.setPreventInvalidInput(true);
//            HorizontalLayout layout = new HorizontalLayout(countryCode, number);
//            layout.setFlexGrow(1.0, number);
//            add(layout);
//        }
//
//        @Override
//        protected String generateModelValue() {
//            if (countryCode.getValue() != null && number.getValue() != null) {
//                String s = countryCode.getValue() + " " + number.getValue();
//                return s;
//            }
//            return "";
//        }
//
//        @Override
//        protected void setPresentationValue(String phoneNumber) {
//            String[] parts = phoneNumber != null ? phoneNumber.split(" ", 2) : new String[0];
//            if (parts.length == 1) {
//                countryCode.clear();
//                number.setValue(parts[0]);
//            } else if (parts.length == 2) {
//                countryCode.setValue(parts[0]);
//                number.setValue(parts[1]);
//            } else {
//                countryCode.clear();
//                number.clear();
//            }
//        }
//    }

}
