package com.uep.wap.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Dashboards")
public class Dashboard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long dashboardId;


    private String dashboardName;

//    @OneToOne
//    @JoinColumn(name = "dashboard")
//    private Project projects;

    @ManyToOne
    @JoinColumn(name = "dashboards")
    private _User user;

    public Dashboard() {
    }

    public long getDashboardId() {
        return dashboardId;
    }

    public void setDashboardId(long dashboardId) {
        this.dashboardId = dashboardId;
    }

    public void setDashboardName(String dashboardName) {
        this.dashboardName = dashboardName;
    }

//    public void setProjects(Project projects) {
//        this.projects = projects;
//    }

    public void setUser(_User user) {
        this.user = user;
    }

    public String getDashboardName() {
        return dashboardName;
    }

//    public Project getProjects() {
//        return projects;
//    }

    public _User getUser() {
        return user;
    }

}
