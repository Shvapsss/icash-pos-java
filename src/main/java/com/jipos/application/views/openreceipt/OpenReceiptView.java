package com.jipos.application.views.openreceipt;

import com.google.gson.annotations.SerializedName;
import com.jipos.application.data.entity.SamplePerson;
import com.jipos.application.data.entity.SampleReceipt;
import com.jipos.application.data.service.SamplePersonService;
import com.jipos.application.data.service.SampleReceiptService;
import com.jipos.application.views.main.MainView;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.customfield.CustomField;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.component.dependency.CssImport;

import java.util.HashMap;
import java.util.Map;

@Route(value = "open-receipt", layout = MainView.class)
@PageTitle("Кассовый чек (БСО)")
@CssImport("./views/openreceipt/openreceipt-view.css")
public class OpenReceiptView extends Div {

    ComboBox<Integer> calcAttribute = new ComboBox<>();
    ComboBox<Integer> taxSystem = new ComboBox<>();
    private TextField cashier;
    private TextField amountReceipt;
    private TextField amountCashReceipt;
    private TextField amountElectronReceipt;


//    private TextField firstName = new TextField("First name");
//    private TextField lastName = new TextField("Last name");
//    private EmailField email = new EmailField("Email address");
//    private DatePicker dateOfBirth = new DatePicker("Birthday");
//    private PhoneNumberField phone = new PhoneNumberField("Phone number");
//    private TextField occupation = new TextField("Occupation");

    private Button cancel = new Button("Cancel");
    private Button save = new Button("Save");

    private Binder<SampleReceipt> binder = new Binder(SampleReceipt.class);

    public OpenReceiptView(SampleReceiptService receiptService) {
        addClassName("openreceipt-view");


        Tab tab1 = new Tab("Основное");
        Tab tab2 = new Tab("Дополнительно");

        Div page1 = new Div();
        page1.add(createFormLayout());
        page1.add(createButtonLayout());

        Div page2 = new Div();
        page2.setText("Page#2");
        page2.setVisible(false);

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
//        add(createFormLayout());
//        add(createButtonLayout());


        binder.bindInstanceFields(this);
        clearForm();

        cancel.addClickListener(e -> clearForm());
        save.addClickListener(e -> {
            receiptService.update(binder.getBean());
            Notification.show(binder.getBean().getClass().getSimpleName() + " details stored.");
            clearForm();
        });
    }

    private void clearForm() {
        binder.setBean(new SampleReceipt());
    }

    private Component createTitle() {
        return new H3("Кассовый чек (БСО)");
    }

    private Component createFormLayout() {
        FormLayout formLayout = new FormLayout();
        //email.setErrorMessage("Please enter a valid email address");
        //formLayout.add(firstName, lastName, dateOfBirth, phone, email, occupation);
        formLayout.add(calcAttribute, taxSystem, cashier, amountReceipt, amountCashReceipt, amountElectronReceipt);
        return formLayout;
    }

    private Component createButtonLayout() {
        HorizontalLayout buttonLayout = new HorizontalLayout();
        buttonLayout.addClassName("button-layout");
        save.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonLayout.add(save);
        buttonLayout.add(cancel);
        return buttonLayout;
    }

    private static class PhoneNumberField extends CustomField<String> {
        private ComboBox<String> countryCode = new ComboBox<>();
        private TextField number = new TextField();

        public PhoneNumberField(String label) {
            setLabel(label);
            countryCode.setWidth("120px");
            countryCode.setPlaceholder("Country");
            countryCode.setPattern("\\+\\d*");
            countryCode.setPreventInvalidInput(true);
            countryCode.setItems("+354", "+91", "+62", "+98", "+964", "+353", "+44", "+972", "+39", "+225");
            countryCode.addCustomValueSetListener(e -> countryCode.setValue(e.getDetail()));
            number.setPattern("\\d*");
            number.setPreventInvalidInput(true);
            HorizontalLayout layout = new HorizontalLayout(countryCode, number);
            layout.setFlexGrow(1.0, number);
            add(layout);
        }

        @Override
        protected String generateModelValue() {
            if (countryCode.getValue() != null && number.getValue() != null) {
                String s = countryCode.getValue() + " " + number.getValue();
                return s;
            }
            return "";
        }

        @Override
        protected void setPresentationValue(String phoneNumber) {
            String[] parts = phoneNumber != null ? phoneNumber.split(" ", 2) : new String[0];
            if (parts.length == 1) {
                countryCode.clear();
                number.setValue(parts[0]);
            } else if (parts.length == 2) {
                countryCode.setValue(parts[0]);
                number.setValue(parts[1]);
            } else {
                countryCode.clear();
                number.clear();
            }
        }
    }

}
