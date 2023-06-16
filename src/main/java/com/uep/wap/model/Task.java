package com.uep.wap.model;

import java.util.Date;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long TaskId;


    private String taskName;


    private Date estimatedTime;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userForTask;


    @ManyToOne
    @JoinColumn(name = "tasksList")
    private Project projectForTask;


    @JoinColumn(name = "assignedTasks")
    @ManyToOne
    private KanbanBoard kanbanBoard;


    private Date expirationDate;



}
