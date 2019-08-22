package com.company.sales.web.screens.customer;

import com.company.sales.entity.Order;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.model.InstanceLoader;
import com.haulmont.cuba.gui.screen.*;
import com.company.sales.entity.Customer;

import javax.inject.Inject;

@UiController("sales_Customer.edit")
@UiDescriptor("customer-edit.xml")
@EditedEntityContainer("customerDc")
//@LoadDataBeforeShow


public class CustomerEdit extends StandardEditor<Customer> {
    @Inject
    private InstanceContainer<Customer> customerDc;
    @Inject
    private InstanceLoader<Customer> customerDl;
    @Inject
    private CollectionLoader<Order> ordersDl;

    @Subscribe
    private void onBeforeShow(BeforeShowEvent event) {
        customerDl.load();
        ordersDl.setParameter("customer", customerDc.getItem());
        ordersDl.load();

    }
}