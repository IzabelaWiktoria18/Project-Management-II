package com.uep.wap.dto;

import com.uep.wap.model.Project;
import com.uep.wap.model._User;


public class DashboardDTO {
    private String dashboardName;

    private Project projects;

    private _User user;

    public void setDashboardName(String dashboardName) {
        this.dashboardName = dashboardName;
    }

    public void setProjects(Project projects) {
        this.projects = projects;
    }

    public void setUser(_User user) {
        this.user = user;
    }

    public String getDashboardName() {
        return dashboardName;
    }

    public Project getProjects() {
        return projects;
    }

    public _User getUser() {
        return user;
    }
}
