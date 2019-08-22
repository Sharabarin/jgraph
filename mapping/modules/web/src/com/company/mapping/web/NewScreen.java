package com.company.mapping.web;

import com.haulmont.cuba.core.entity.Entity;
import com.haulmont.cuba.core.global.CommitContext;
import com.haulmont.cuba.gui.screen.*;


import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.gui.components.VBoxLayout;
import com.haulmont.cuba.gui.data.CollectionDatasource;
import com.haulmont.cuba.web.gui.components.WebComponentsHelper;
import com.haulmont.cuba.web.gui.components.WebFileDescriptorResource;

import com.vaadin.server.Resource;
import com.vaadin.ui.Layout;
import org.vaadin.addon.leaflet.LLayerGroup;
import org.vaadin.addon.leaflet.LMap;
import org.vaadin.addon.leaflet.LMarker;
import org.vaadin.addon.leaflet.LOpenStreetMapLayer;
import org.vaadin.addon.leaflet.shared.Point;
import javax.inject.Inject;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;



import com.vaadin.server.ClassResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.Component;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Notification.Type;
import org.vaadin.addon.leaflet.*;
import org.vaadin.addon.leaflet.shared.Bounds;
import org.vaadin.addon.leaflet.shared.Control;
import org.vaadin.addon.leaflet.shared.Point;


import java.util.ArrayList;
import java.util.Arrays;

@UiController("mapping_NewScreen")
@UiDescriptor("new-screen.xml")
public class NewScreen extends Screen {


    private static final double DEFAULT_LATITUDE = 53.241505;
    private static final double DEFAULT_LONGITUDE = 50.221245;
    private static final double ZOOM_LEVEL = 12;

    private LMap map;


    private void initMap() {
        map = new LMap();
        map.setZoomLevel(ZOOM_LEVEL);
        map.addLayer(new LOpenStreetMapLayer());
        map.setCenter(new Point(DEFAULT_LATITUDE, DEFAULT_LONGITUDE));
    }


    @Inject
    private VBoxLayout mapContainer;

    private void addMapToContainer() {
        Layout layout = (Layout) WebComponentsHelper.unwrap(mapContainer);
        layout.addComponent(map);
    }

    @Subscribe
    private void onInit(InitEvent event) {
        initMap();
        addMapToContainer();
    }

    
     
    
    
    
    
}