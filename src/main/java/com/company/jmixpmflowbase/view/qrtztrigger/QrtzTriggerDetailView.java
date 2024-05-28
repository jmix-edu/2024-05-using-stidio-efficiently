package com.company.jmixpmflowbase.view.qrtztrigger;

import com.company.jmixpmflowbase.entity.QrtzTrigger;

import com.company.jmixpmflowbase.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "qrtzTriggers/:id", layout = MainView.class)
@ViewController("QrtzTrigger.detail")
@ViewDescriptor("qrtz-trigger-detail-view.xml")
@EditedEntityContainer("qrtzTriggerDc")
public class QrtzTriggerDetailView extends StandardDetailView<QrtzTrigger> {
}