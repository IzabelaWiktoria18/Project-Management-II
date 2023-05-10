package com.uep.wap.model;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "Task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long TaskId;


    private String taskName;


    private Date estimatedTime;

    @OneToOne(mappedBy = "task", cascade = CascadeType.ALL)
    private User assignedUser;


    @ManyToOne
    @JoinColumn(name = "tasksList")
    private Project project;


    @JoinColumn(name = "assignedTasks")
    @ManyToOne
    private KanbanBoard kanbanBoard;

    public Task() {
    }

    public void setTaskId(long taskId) {
        TaskId = taskId;
    }

    public long getTaskId() {
        return TaskId;
    }

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
