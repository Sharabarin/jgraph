package com.company.practic.web.screens.fabric;

import com.haulmont.cuba.gui.screen.*;
import com.company.practic.entity.Fabric;

@UiController("practic_Fabric.browse")
@UiDescriptor("fabric-browse.xml")
@LookupComponent("fabricsTable")
@LoadDataBeforeShow
public class FabricBrowse extends StandardLookup<Fabric> {
}