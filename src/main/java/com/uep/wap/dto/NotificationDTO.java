package com.uep.wap.dto;

import com.uep.wap.model.AppProjectManagementII;
import com.uep.wap.model.User;

import javax.persistence.*;

public class NotificationDTO {
    private String notificationName;

    private AppProjectManagementII app;

    private User user;

    public void setNotificationName(String notificationName) {
        this.notificationName = notificationName;
    }

    public void setApp(AppProjectManagementII app) {
        this.app = app;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getNotificationName() {
        return notificationName;
    }

    public AppProjectManagementII getApp() {
        return app;
    }

    public User getUser() {
        return user;
    }
}
