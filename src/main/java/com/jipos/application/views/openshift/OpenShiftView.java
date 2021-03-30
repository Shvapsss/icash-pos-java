package com.jipos.application.views.openshift;

import com.google.gson.Gson;
import com.jipos.application.json.PostJson;
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
@CssImport("./views/открытьсмену/открытьсмену-view.css")
public class OpenShiftView extends HorizontalLayout {

    private TextField cashier;
    private TextField inn;
    private Button sayHello;

    public OpenShiftView() {
        addClassName("открытьсмену-view");
        cashier = new TextField("Your Cashier name");
        inn = new TextField("Your inn (1203)");

        sayHello = new Button("Say hello");
        add(cashier, inn, sayHello);
        setVerticalComponentAlignment(Alignment.END, inn, sayHello);
        sayHello.addClickListener(e -> {
            if( !cashier.isEmpty()) {
                Notification.show("Hello " + inn.getValue());
                OpenShift openShift = new OpenShift(cashier.getValue());
                postShift(openShift);
            }
        });
    }

    public void postShift(OpenShift openShift){
        Gson gson = new Gson();
        PostJson postJson = new PostJson();
        postJson.post("http://5.134.218.202:7374/api/1/shift/open",gson.toJson(openShift));


        //gson.toJson(openShift);
        Notification.show("Hello " + inn.getValue() + " / "+ cashier.getValue());

    }

}
