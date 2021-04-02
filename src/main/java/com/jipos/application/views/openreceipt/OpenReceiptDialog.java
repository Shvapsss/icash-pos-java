package com.jipos.application.views.openreceipt;

import com.jipos.application.data.VatEnum;
import com.jipos.application.data.entity.SampleProduct;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.Shortcuts;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.textfield.TextField;

import java.util.Arrays;
import java.util.List;
@CssImport("./views/openreceipt/openreceipt-view.css")
public class OpenReceiptDialog {

    public static void openProductDialog(Grid grid, List products) {
        Dialog dialog = new Dialog();
        Div content = new Div();
        content.addClassName("product-dialog-style");


        TextField product = new TextField("Продукт:");
        TextField quantity = new TextField("Количество:", event -> {
            //TODO
            // сделать расчет суммы     summ
        });
        ComboBox<VatEnum> vat = new ComboBox<>();
        vat.setItems(Arrays.asList(VatEnum.values()));

        TextField price = new TextField("Цена:", event -> {
            //TODO
            // сделать расчет суммы     summ

        });
//        TextField sum = new TextField("Сумма:");
//        sum.setEnabled(false);


        Button confirmButton = new Button("Добавить", event -> {
            SampleProduct sampleProduct = new SampleProduct();
            sampleProduct.setItemName(product.getValue());
            sampleProduct.setItemQuantity(quantity.getValue());
            sampleProduct.setPriceIntoDiscountsMargins(price.getValue());


            products.add(sampleProduct);
            grid.setItems(products);
            dialog.close();
        });
        Button cancelButton = new Button("Отмена", event -> {
            dialog.close();
        });
        // Cancel action on ESC press
        Shortcuts.addShortcutListener(dialog, () -> {
            dialog.close();
        }, Key.ESCAPE);

        content.add(product,quantity,vat,price,
                //sum,
                new Div( confirmButton, cancelButton));
        dialog.add(content);
        dialog.open();
    }

    private static int summ(int a, int c){
        if(a>0 && c>0) {
            return a * c;
        }else {
            return 0;
        }
    }

}
