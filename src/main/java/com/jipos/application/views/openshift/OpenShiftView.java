package com.jipos.application.views.openshift;

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

    private TextField сashier;
    private TextField inn;
    private Button sayHello;

    public OpenShiftView() {
        addClassName("открытьсмену-view");
        сashier = new TextField("Your Cashier name");
        inn = new TextField("Your inn (1203)");

        sayHello = new Button("Say hello");
        add(сashier, inn, sayHello);
        setVerticalComponentAlignment(Alignment.END, inn, sayHello);
        sayHello.addClickListener(e -> {
            Notification.show("Hello " + inn.getValue());
        });
    }

}
