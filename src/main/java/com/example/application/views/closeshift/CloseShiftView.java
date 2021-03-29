package com.example.application.views.closeshift;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.example.application.views.main.MainView;
import com.vaadin.flow.component.dependency.CssImport;

@Route(value = "close-shift", layout = MainView.class)
@PageTitle("Закрыть смену")
@CssImport("./views/закрытьсмену/закрытьсмену-view.css")
public class CloseShiftView extends HorizontalLayout {

    private TextField name;
    private Button sayHello;

    public CloseShiftView() {
        addClassName("закрытьсмену-view");
        name = new TextField("Your name");
        sayHello = new Button("Say hello");
        add(name, sayHello);
        setVerticalComponentAlignment(Alignment.END, name, sayHello);
        sayHello.addClickListener(e -> {
            Notification.show("Hello " + name.getValue());
        });
    }

}
