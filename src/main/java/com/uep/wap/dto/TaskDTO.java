package com.uep.wap.dto;

import com.uep.wap.model.KanbanBoard;
import com.uep.wap.model.Project;
import com.uep.wap.model.User;

import javax.persistence.*;
import java.util.Date;

public class TaskDTO {
    private String taskName;


    private Date estimatedTime;

    private User assignedUser;

    private Project project;


    private KanbanBoard kanbanBoard;

    public String getTaskName() {
        return taskName;
    }

    public Date getEstimatedTime() {
        return estimatedTime;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public User getAssignedUser() {
        return assignedUser;
    }

    public Project getProject() {
        return project;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setEstimatedTime(Date estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public void setAssignedUser(User assignedUser) {
        this.assignedUser = assignedUser;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public void setKanbanBoard(KanbanBoard kanbanBoard) {
        this.kanbanBoard = kanbanBoard;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public KanbanBoard getKanbanBoard() {
        return kanbanBoard;
    }

    private Date expirationDate;
}
