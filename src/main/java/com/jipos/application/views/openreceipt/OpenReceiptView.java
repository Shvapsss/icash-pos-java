package com.jipos.application.views.openreceipt;

import com.jipos.application.data.CalculationAttributeEnum;
import com.jipos.application.data.TaxSystemEnum;
import com.jipos.application.data.entity.SampleProduct;
import com.jipos.application.data.AgentEnum;
import com.jipos.application.data.service.SampleReceiptService;
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

    private ComboBox<CalculationAttributeEnum> calcAttribute = new ComboBox<>();
    private ComboBox<TaxSystemEnum> taxSystem = new ComboBox<>();

    private TextField cashier= new TextField("Кассир");
    private TextField amountReceipt= new TextField("Сумма чека");
    private TextField amountCashReceipt= new TextField("Сумма чека наличными");
    private TextField amountElectronReceipt = new TextField("Сумма чека электронными");


//    private Button cancel = new Button("Cancel");
    private Button addButton = new Button("Добавить продукт");
    private Button save = new Button("Печать");

//    private Binder<SampleReceipt> binder = new Binder(SampleReceipt.class);

    public OpenReceiptView(SampleReceiptService receiptService) {
        addClassName("openreceipt-view");
        calcAttribute.isRequired();
        taxSystem.isRequired();
        cashier.isRequired();
        amountReceipt.isRequired();
        amountCashReceipt.isRequired();
        amountElectronReceipt.isRequired();
        calcAttribute.setItems(Arrays.asList(CalculationAttributeEnum.values()));
        taxSystem.setItems(Arrays.asList(TaxSystemEnum.values()));

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
            products.forEach(product -> Notification.show(
                    product.getItemName()));
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

    private Component addAdditionallyReceipt(){
        FormLayout formAdditionallyLayout = new FormLayout();
        TextField T1227= new TextField("T1227");
        TextField T1228= new TextField("T1228");
        TextField T1008= new TextField("T1008");
        TextField T1036= new TextField("T1036");
        TextField T1215= new TextField("T1215");
        TextField T1216= new TextField("T1216");
        TextField T1217= new TextField("T1217");
        TextField T1102= new TextField("T1102");
        TextField T1103= new TextField("T1103");
        TextField T1104= new TextField("T1104");
        TextField T1105= new TextField("T1105");
        TextField T1106= new TextField("T1106");
        TextField T1107= new TextField("T1107");
        ComboBox<AgentEnum> T1057 = new ComboBox<>("T1057");
        T1057.setItems(Arrays.asList(AgentEnum.values()));
        TextField T1075= new TextField("T1075");
        TextField T1044= new TextField("T1044");
        TextField T1073= new TextField("T1073");
        TextField T1074= new TextField("T1074");
        TextField T1026= new TextField("T1026");
        TextField T1005= new TextField("T1005");
        TextField T1016= new TextField("T1016");
        TextField T1171= new TextField("T1171");
        TextField T1192= new TextField("T1192");
        TextField T1084= new TextField("T1084");
        TextField T1085= new TextField("T1085");
        TextField T1086= new TextField("T1086");
        TextField T1203= new TextField("T1203");

        formAdditionallyLayout.add(T1227, T1228, T1008, T1036, T1215, T1216,T1217,T1102,T1103,T1104,T1105,T1106,T1057,T1075,T1044,T1073,T1074,T1026,T1005,T1016,T1171,T1192,T1084,T1085,T1086,T1203);
        return formAdditionallyLayout;
    }

    private Component createTitle() {
        return new H3("Кассовый чек (БСО)");
    }
    private Grid createMainProductGrid() {
        Grid<SampleProduct> grid = new Grid<>();
        //grid.setColumns("itemName", "itemQuantity", "priceIntoDiscountsMargins", "vatTaxRate");
        grid.addColumn(SampleProduct::getItemName).setHeader("Продукт");
        grid.addColumn(SampleProduct::getItemQuantity).setHeader("Количество");
        grid.addColumn(SampleProduct::getVatTaxRate).setHeader("НДС");
        grid.addColumn(SampleProduct::getPriceIntoDiscountsMargins).setHeader("Цена");
        // Or you can use an ordinary function to setup the component
        grid.addComponentColumn(item -> createRemoveButton(grid, item))
                .setHeader("Действие");
        return grid;
    }

    private Component createFormLayout() {
        FormLayout formLayout = new FormLayout();
        formLayout.add(calcAttribute, taxSystem, cashier, amountReceipt, amountCashReceipt, amountElectronReceipt);
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
