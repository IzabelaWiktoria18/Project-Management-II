package com.uep.wap.model;

import javax.persistence.*;
import java.util.List;

public class AppProjectManagementII {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long appId;

    @OneToMany(mappedBy = "app", cascade = CascadeType.ALL)
    private List<Project> projects;

    @OneToMany(mappedBy = "app", cascade = CascadeType.ALL)
    private List<User> users;

    @OneToMany(mappedBy = "app", cascade = CascadeType.ALL)
    private List<Notification> notifications;

    public AppProjectManagementII() {
    }

    public long getAppId() {
        return appId;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Notification> getNotifications() {
        return notifications;
    }


    public void setAppId(long appId) {
        this.appId = appId;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }
}
