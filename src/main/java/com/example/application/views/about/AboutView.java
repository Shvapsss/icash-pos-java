package com.example.application.views.about;

import com.example.application.views.GetJson;
import com.google.gson.Gson;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.example.application.views.main.MainView;
import com.vaadin.flow.component.dependency.CssImport;

@Route(value = "about", layout = MainView.class)
@PageTitle("About")
@CssImport("./views/about/about-view.css")
public class AboutView extends Div {

    public AboutView() {
        addClassName("about-view");

        Gson gson = new Gson();

        //gson.fromJson(new GetJson().getJson());

        add(new Text("111"));
    }

}
