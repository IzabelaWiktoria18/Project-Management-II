package com.uep.wap.dto;

import com.uep.wap.model.Notification;
import com.uep.wap.model.Project;
import com.uep.wap.model._User;

import java.util.List;

public class AppProjectManagementIIDTO {
    private List<Project> projects;

    private List<_User> users;

    private List<Notification> notifications;


    public List<Project> getProjects() {
        return projects;
    }

    public List<_User> getUsers() {
        return users;
    }

    public List<Notification> getNotifications() {
        return notifications;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public void setUsers(List<_User> users) {
        this.users = users;
    }

    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }
}
