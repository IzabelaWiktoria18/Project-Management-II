package com.uep.wap.dto;

import com.uep.wap.model.*;

import java.util.List;

public class ProjectDTO {
    private String projectName;

    private List<_User> usersList;

    private Team assignedTeam;

    private List<Report> projectReports;

    private List<Task> tasksList;

    private AppProjectManagementII app;

    private KanbanBoard kanbanBoard;

    private Dashboard dashboard;

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setUsersList(List<_User> usersList) {
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

    public String getProjectName() {
        return projectName;
    }

    public List<_User> getUsersList() {
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
