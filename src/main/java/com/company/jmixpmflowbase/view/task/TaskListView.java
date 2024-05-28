package com.company.jmixpmflowbase.view.task;

import com.company.jmixpmflowbase.app.TaskService;
import com.company.jmixpmflowbase.entity.Project;
import com.company.jmixpmflowbase.entity.Task;

import com.company.jmixpmflowbase.entity.User;
import com.company.jmixpmflowbase.view.main.MainView;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.flowui.Notifications;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Route(value = "tasks", layout = MainView.class)
@ViewController("Task_.list")
@ViewDescriptor("task-list-view.xml")
@LookupComponent("tasksDataGrid")
@DialogMode(width = "64em")
public class TaskListView extends StandardListView<Task> {

    @Autowired
    private TaskService taskService;
    @Autowired
    private DataManager dataManager;
    @Autowired
    private Notifications notifications;

    private void getLBU() {
        User leastBusyUser = taskService.findLeastBusyUser();
        List<Project> list = dataManager.load(Project.class)
                .query("select p from Project p where p.manager.id = :current_user_id")
                .list();
        notifications.create("some")
                .withType(Notifications.Type.DEFAULT)
                .withPosition(Notification.Position.BOTTOM_END)
                .show();
    }
}