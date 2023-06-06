package com.uep.wap.dto;

import com.uep.wap.model.Project;
import com.uep.wap.model.Task;
import com.uep.wap.model.Team;


import java.util.List;

public class KanbanBoardDTO {
    private Project projectName;

    private List<Team> listOfTeams;

    private List<Task> assignedTasks;

    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }

    public void setProjectName(Project projectName) {
        this.projectName = projectName;
    }

    public void setListOfTeams(List<Team> listOfTeams) {
        this.listOfTeams = listOfTeams;
    }

    public void setAssignedTasks(List<Task> assignedTasks) {
        this.assignedTasks = assignedTasks;
    }

    public String getBoardName() {
        return boardName;
    }

    public Project getProjectName() {
        return projectName;
    }

    public List<Team> getListOfTeams() {
        return listOfTeams;
    }

    public List<Task> getAssignedTasks() {
        return assignedTasks;
    }

    private String boardName;


}
