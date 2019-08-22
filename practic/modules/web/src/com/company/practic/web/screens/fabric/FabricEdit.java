package com.company.practic.web.screens.fabric;

import com.haulmont.cuba.gui.screen.*;
import com.company.practic.entity.Fabric;

@UiController("practic_Fabric.edit")
@UiDescriptor("fabric-edit.xml")
@EditedEntityContainer("fabricDc")
@LoadDataBeforeShow
public class FabricEdit extends StandardEditor<Fabric> {

}