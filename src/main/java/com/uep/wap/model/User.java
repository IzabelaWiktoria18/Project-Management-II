package com.uep.wap.model;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long UserId;

    private String userName;


    private String userSurname;


    private String userRole;


    private String eMail;


    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Notification> listOfNotifications;


    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Dashboard> dashboards;


    @ManyToOne
    @JoinColumn(name = "users")
    private AppProjectManagementII app;

    @OneToOne(mappedBy = "calendarUser", cascade = CascadeType.ALL)
    private Calendar calendar;

    @OneToOne
    @JoinColumn(name = "assignedUser")
    private Task task;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "listOfMembers")
    private List<Team> listOfTeams;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "usersList")
    private List<Team> listOfProjects;
    public User() {
    }

    public void setUserId(long userId) {
        UserId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setListOfNotifications(List<Notification> listOfNotifications) {
        this.listOfNotifications = listOfNotifications;
    }

    public void setDashboards(List<Dashboard> dashboards) {
        this.dashboards = dashboards;
    }

    public void setApp(AppProjectManagementII app) {
        this.app = app;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public void setListOfTeams(List<Team> listOfTeams) {
        this.listOfTeams = listOfTeams;
    }

    public void setListOfProjects(List<Team> listOfProjects) {
        this.listOfProjects = listOfProjects;
    }

    public long getUserId() {
        return UserId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public String getUserRole() {
        return userRole;
    }

    public String geteMail() {
        return eMail;
    }

    public List<Notification> getListOfNotifications() {
        return listOfNotifications;
    }

    public List<Dashboard> getDashboards() {
        return dashboards;
    }

    public AppProjectManagementII getApp() {
        return app;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public Task getTask() {
        return task;
    }

    public List<Team> getListOfTeams() {
        return listOfTeams;
    }

    public List<Team> getListOfProjects() {
        return listOfProjects;
    }


}
