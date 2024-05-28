package com.company.jmixpmflowbase.view.task;

import com.company.jmixpmflowbase.entity.Task;

import com.company.jmixpmflowbase.entity.User;
import com.company.jmixpmflowbase.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.flowui.Notifications;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "tasks/:id", layout = MainView.class)
@ViewController("Task_.detail")
@ViewDescriptor("task-detail-view.xml")
@EditedEntityContainer("taskDc")
public class TaskDetailView extends StandardDetailView<Task> {

    @Autowired
    protected DataManager dataManager;
    @Autowired
    private Notifications notifications;

    public void createUser() {
        User user = dataManager.create(User.class);

    }
}