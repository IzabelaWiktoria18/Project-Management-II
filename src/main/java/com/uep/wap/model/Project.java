package com.uep.wap.model;
import javax.persistence.*;
import java.util.List;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Projects")
public class Project{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ProjectId;


    private String projectName;


    @ManyToMany
    @JoinColumn(name = "listOfProjects")
    private List<User> usersList;


    @OneToMany
    @JoinColumn(name = "project")
    private Team assignedTeam;


    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
    private List<Report> projectReports;


    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
    private List<Task> tasksList;

    @ManyToOne
    @JoinColumn(name = "projects")
    private AppProjectManagementII app;

    @OneToOne(mappedBy = "projectName", cascade = CascadeType.ALL)
    private KanbanBoard kanbanBoard;

    @OneToOne
    @JoinColumn(name = "project")
    private Dashboard dashboard;

    public Project() {
    }

    public void setProjectId(long projectId) {
        ProjectId = projectId;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setUsersList(List<User> usersList) {
        this.usersList = usersList;
    }

    public void setAssignedTeam(Team assignedTeam) {
        this.assignedTeam = assignedTeam;
    }

    public void setProjectReports(List<Report> projectReports) {
        this.projectReports = projectReports;
    }

    public void setTasksList(List<Task> tasksList) {
        this.tasksList = tasksList;
    }

    public void setApp(AppProjectManagementII app) {
        this.app = app;
    }

    public void setKanbanBoard(KanbanBoard kanbanBoard) {
        this.kanbanBoard = kanbanBoard;
    }

    public void setDashboard(Dashboard dashboard) {
        this.dashboard = dashboard;
    }

    public long getProjectId() {
        return ProjectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public List<User> getUsersList() {
        return usersList;
    }

    public Team getAssignedTeam() {
        return assignedTeam;
    }

    public List<Report> getProjectReports() {
        return projectReports;
    }

    public List<Task> getTasksList() {
        return tasksList;
    }

    public AppProjectManagementII getApp() {
        return app;
    }

    public KanbanBoard getKanbanBoard() {
        return kanbanBoard;
    }

    public Dashboard getDashboard() {
        return dashboard;
    }
}