package com.uep.wap.dto;

import com.uep.wap.model.*;

import javax.persistence.*;
import java.util.List;

public class UserDTO {
    private String userName;

    private String userSurname;

    private String userRole;

    private String eMail;

    private List<Notification> listOfNotifications;

    private List<Dashboard> dashboards;

    private AppProjectManagementII app;

    private Calendar calendar;

    private Task task;

    private List<Team> listOfTeams;

    private List<Team> listOfProjects;

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
