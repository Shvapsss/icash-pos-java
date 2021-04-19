package com.jipos.application.views.closeshift;

import com.google.gson.Gson;
import com.jipos.application.json.ApiConnecting;
import com.jipos.application.views.main.MainView;
import com.jipos.application.dto.OpenShift;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.component.dependency.CssImport;

@Route(value = "close-shift", layout = MainView.class)
@PageTitle("Закрыть смену")
@CssImport("./views/closeshift/closeshift-view.css")
public class CloseShiftView extends HorizontalLayout {

    private TextField cashier;
    private TextField inn;
    private Button sayHello;
    private ApiConnecting apiConnecting;

    public CloseShiftView(ApiConnecting apiConnecting) {
        this.apiConnecting = apiConnecting;

        addClassName("close-shift-view");
        cashier = new TextField("Your Cashier name");
        inn = new TextField("Your inn (1203)");

        sayHello = new Button("Закрыть смену");
        add(cashier, inn, sayHello);
        setVerticalComponentAlignment(Alignment.END, cashier, sayHello);
        sayHello.addClickListener(e -> {
            OpenShift openShift = new OpenShift(cashier.getValue());
            postShift(openShift);
        });
    }

    public void postShift(OpenShift openShift){
        Gson gson = new Gson();
//        ApiConnecting apiConnecting = new ApiConnecting();
        String s = apiConnecting.postJson("/api/1/shift/close",gson.toJson(openShift));

        Notification.show(s);

    }

}
