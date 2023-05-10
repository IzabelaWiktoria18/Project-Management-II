package com.uep.wap.model;
import javax.persistence.*;

@Entity
@Table(name = "Notifications")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long notificationId;


    private String notificationName;


    @ManyToOne
    @JoinColumn(name = "users")
    private AppProjectManagementII app;

    @ManyToOne
    @JoinColumn(name = "listOfNotifications")
    private User user;

    public Notification() {
    }

    public void setNotificationId(long notificationId) {
        this.notificationId = notificationId;
    }

    public void setNotificationName(String notificationName) {
        this.notificationName = notificationName;
    }

    public void setApp(AppProjectManagementII app) {
        this.app = app;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public long getNotificationId() {
        return notificationId;
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
