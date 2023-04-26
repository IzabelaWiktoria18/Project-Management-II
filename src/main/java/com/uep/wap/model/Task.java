package main.java.com.uep.wap.model;

import java.util.Date;

@Entity
@Table(name = "Task")
public class Task {
    @Id
    @Column(name = "task_id")
    private long TaskId;

    @Column(name = "task_name")
    private String taskName;

    @Column(name = "estimated_time")
    private Date estimatedTime;

    @Column(name = "expiration_date")
    private Date expirationDate;

    @Column(name = "assigned_user")
    @OneToOne(mappedBy = "task", cascade = CascadeType.ALL)
    private User assignedUser;

    @Column(name = "project")
    @JoinColumn(name = "project_id")
    @ManyToOne
    private Project project;

    @Column(name = "kanbanBoard")
    @JoinColumn(name = "board_id")
    @ManyToOne
    private KanbanBoard kanbanBoard;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
}
