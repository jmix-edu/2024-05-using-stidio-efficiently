package com.company.jmixpmflowbase.view.qrtztrigger;

import com.company.jmixpmflowbase.entity.QrtzTrigger;

import com.company.jmixpmflowbase.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "qrtzTriggers", layout = MainView.class)
@ViewController("QrtzTrigger.list")
@ViewDescriptor("qrtz-trigger-list-view.xml")
@LookupComponent("qrtzTriggersDataGrid")
@DialogMode(width = "64em")
public class QrtzTriggerListView extends StandardListView<QrtzTrigger> {
}