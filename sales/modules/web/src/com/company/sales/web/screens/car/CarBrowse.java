package com.company.sales.web.screens.car;

import com.haulmont.cuba.gui.screen.*;
import com.company.sales.entity.Car;

@UiController("sales_Car.browse")
@UiDescriptor("car-browse.xml")
@LookupComponent("carsTable")
@LoadDataBeforeShow
public class CarBrowse extends StandardLookup<Car> {
}