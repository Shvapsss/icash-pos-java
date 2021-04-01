package com.jipos.application.views.about;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jipos.application.dto.FiscalAccumulator;
import com.jipos.application.json.ApiConnecting;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.jipos.application.views.main.MainView;
import com.vaadin.flow.component.dependency.CssImport;

import java.io.IOException;

@Route(value = "about", layout = MainView.class)
@PageTitle("About")
@CssImport("./views/about/about-view.css")
public class AboutView extends Div {

    public AboutView() throws IOException {
        addClassName("about-view");

        ApiConnecting apiConnecting = new ApiConnecting();
        String s = apiConnecting.getJson("http://10.0.0.153/api/1/status");
        //String s = apiConnecting.getJson("http://10.0.0.153/api/1/getallinfo");


        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        FiscalAccumulator fiscalAccumulator = gson.fromJson(s, FiscalAccumulator.class);

        

        add(new Text(fiscalAccumulator.toString()));
    }

}
