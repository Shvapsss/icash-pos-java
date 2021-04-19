package com.jipos.application.views.about;


import com.jipos.application.data.entity.UserConfig;
import com.jipos.application.data.service.UserConfigRepository;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.jipos.application.views.main.MainView;
import com.vaadin.flow.component.dependency.CssImport;


import java.io.IOException;

@Route(value = "about", layout = MainView.class)
@PageTitle("About")
@CssImport("./views/about/about-view.css")
public class AboutView extends Div {
    public AboutView(UserConfigRepository userRepo) throws IOException {
        addClassName("about-view");

        TextField url = new TextField("URL:");
        Button save = new Button("Save");

        url.setValue(userRepo.findById("URL").orElse(new UserConfig()).getValue());


        save.addClickListener(event ->
                {
                    UserConfig userConfig = new UserConfig();
                    userConfig.setKey("URL");
                    userConfig.setValue(url.getValue());
                    userRepo.save(userConfig);
                    Notification.show(url.getValue()+" сохранен в базу.");
                });
//
//        ApiConnecting apiConnecting = new ApiConnecting();
//        String s = apiConnecting.getJson("http://5.134.218.202:7374/api/1/status");
//        //String s = apiConnecting.getJson("http://10.0.0.153/api/1/getallinfo");
//
//
//        GsonBuilder builder = new GsonBuilder();
//        builder.setPrettyPrinting();
//        Gson gson = builder.create();
//        FiscalAccumulator fiscalAccumulator = gson.fromJson(s, FiscalAccumulator.class);
//
//

//        add(new Text(fiscalAccumulator.toString()));
        add(url,save);
    }

}
