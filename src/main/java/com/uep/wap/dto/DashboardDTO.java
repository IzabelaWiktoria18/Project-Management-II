package com.uep.wap.dto;

import com.uep.wap.model.Project;
import com.uep.wap.model.User;

import javax.persistence.*;

public class DashboardDTO {
    private String dashboardName;

    private Project projects;

    private User user;

    public void setDashboardName(String dashboardName) {
        this.dashboardName = dashboardName;
    }

    public void setProjects(Project projects) {
        this.projects = projects;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDashboardName() {
        return dashboardName;
    }

    public Project getProjects() {
        return projects;
    }

    public User getUser() {
        return user;
    }
}
