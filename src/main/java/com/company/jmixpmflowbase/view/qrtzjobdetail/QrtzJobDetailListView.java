package com.company.jmixpmflowbase.view.qrtzjobdetail;

import com.company.jmixpmflowbase.entity.QrtzJobDetail;

import com.company.jmixpmflowbase.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "qrtzJobDetails", layout = MainView.class)
@ViewController("QrtzJobDetail.list")
@ViewDescriptor("qrtz-job-detail-list-view.xml")
@LookupComponent("qrtzJobDetailsDataGrid")
@DialogMode(width = "64em")
public class QrtzJobDetailListView extends StandardListView<QrtzJobDetail> {
}