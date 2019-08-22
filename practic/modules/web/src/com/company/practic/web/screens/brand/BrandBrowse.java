package com.company.practic.web.screens.brand;

import com.haulmont.cuba.gui.screen.*;
import com.company.practic.entity.Brand;

@UiController("practic_Brand.browse")
@UiDescriptor("brand-browse.xml")
@LookupComponent("brandsTable")
@LoadDataBeforeShow
public class BrandBrowse extends StandardLookup<Brand> {
}