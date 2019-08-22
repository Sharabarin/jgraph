package com.company.practic.web.screens.brand;

import com.haulmont.cuba.gui.screen.*;
import com.company.practic.entity.Brand;

@UiController("practic_Brand.edit")
@UiDescriptor("brand-edit.xml")
@EditedEntityContainer("brandDc")
@LoadDataBeforeShow
public class BrandEdit extends StandardEditor<Brand> {
}