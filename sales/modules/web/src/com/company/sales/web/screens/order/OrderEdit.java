package com.company.sales.web.screens.order;

import com.company.sales.entity.OrderLine;
import com.haulmont.cuba.gui.model.CollectionChangeType;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.model.CollectionPropertyContainer;
import com.haulmont.cuba.gui.screen.*;
import com.company.sales.entity.Order;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.text.Bidi;

@UiController("sales_Order.edit")
@UiDescriptor("order-edit.xml")
@EditedEntityContainer("orderDc")
@LoadDataBeforeShow
public class OrderEdit extends StandardEditor<Order> {


    @Inject
    private CollectionPropertyContainer<OrderLine> linesDc;

    @Subscribe(id = "linesDc", target = Target.DATA_CONTAINER)
    private void onLinesDcCollectionChange(CollectionContainer.CollectionChangeEvent<OrderLine> event) {
        if (event.getChangeType()!= CollectionChangeType.REFRESH) {calculateAmount();}
    }


    protected void calculateAmount() {
        BigDecimal amount = BigDecimal.ZERO;
        for (OrderLine line: linesDc.getItems()){
            amount= amount.add(line.getProduct().getAmount().multiply(line.getQuantity()));
        }
        getEditedEntity().setAmount(amount);
    }

}