package com.uep.wap.dto;

import com.uep.wap.model.AppProjectManagementII;
import com.uep.wap.model._User;



public class NotificationDTO {
    private String notificationName;

    private AppProjectManagementII app;

    private _User user;

    public void setNotificationName(String notificationName) {
        this.notificationName = notificationName;
    }

    public void setApp(AppProjectManagementII app) {
        this.app = app;
    }

    public void setUser(_User user) {
        this.user = user;
    }

    public String getNotificationName() {
        return notificationName;
    }

    public AppProjectManagementII getApp() {
        return app;
    }

    public _User getUser() {
        return user;
    }
}
