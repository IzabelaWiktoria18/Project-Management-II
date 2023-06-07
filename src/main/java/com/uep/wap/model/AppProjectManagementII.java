package com.uep.wap.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "AppProjectManagmentIIs")
public class AppProjectManagementII {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long appId;

//    @OneToMany(mappedBy = "app", cascade = CascadeType.ALL)
//    private List<Project> projects;

    @OneToMany(mappedBy = "app", cascade = CascadeType.ALL)
    private List<_User> users;

    @OneToMany(mappedBy = "app", cascade = CascadeType.ALL)
    private List<Notification> notifications;

    public AppProjectManagementII() {
    }

    public long getAppId() {
        return appId;
    }

//    public List<Project> getProjects() {
//        return projects;
//    }

    public List<_User> getUsers() {
        return users;
    }

    public List<Notification> getNotifications() {
        return notifications;
    }


    public void setAppId(long appId) {
        this.appId = appId;
    }

//    public void setProjects(List<Project> projects) {
//        this.projects = projects;
//    }

    public void setUsers(List<_User> users) {
        this.users = users;
    }

    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }
}
