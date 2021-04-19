package com.jipos.application.views.openshift;

import com.google.gson.Gson;
import com.jipos.application.dto.OpenShift;
import com.jipos.application.json.ApiConnecting;
import com.jipos.application.views.main.MainView;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.component.dependency.CssImport;

@Route(value = "open-shift", layout = MainView.class)
@RouteAlias(value = "", layout = MainView.class)
@PageTitle("Открыть смену")
@CssImport("./views/openshift/openshift-view.css")
public class OpenShiftView extends HorizontalLayout {

    private TextField cashier;
    private TextField inn;
    private Button sayHello;
    private ApiConnecting apiConnecting;

    public OpenShiftView(ApiConnecting apiConnecting) {
        this.apiConnecting = apiConnecting;

        addClassName("open-shift-view");
        cashier = new TextField("Your Cashier name");
        inn = new TextField("Your inn (1203)");

        sayHello = new Button("Открыть смену");
        add(cashier, inn, sayHello);
        setVerticalComponentAlignment(Alignment.END, inn, sayHello);
        sayHello.addClickListener(e -> {
            if( !cashier.isEmpty()) {
                OpenShift openShift = new OpenShift(cashier.getValue());
                postShift(openShift);
            }
        });
    }

    public void postShift(OpenShift openShift){
        Gson gson = new Gson();
//        ApiConnecting apiConnecting = new ApiConnecting();

        String s = apiConnecting.postJson("/api/1/shift/open",gson.toJson(openShift));

        Notification.show(s);

    }

}
