package com.company.jmixpmflowbase.view.qrtzjobdetail;

import com.company.jmixpmflowbase.entity.QrtzJobDetail;

import com.company.jmixpmflowbase.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "qrtzJobDetails/:id", layout = MainView.class)
@ViewController("QrtzJobDetail.detail")
@ViewDescriptor("qrtz-job-detail-detail-view.xml")
@EditedEntityContainer("qrtzJobDetailDc")
public class QrtzJobDetailDetailView extends StandardDetailView<QrtzJobDetail> {
}