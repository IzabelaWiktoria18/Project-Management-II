package main.java.com.uep.wap.model;

import java.util.List;

@Entity
@Table(name = "KanbanBoard")
public class KanbanBoard {
    @Id
    @Column(name = "board_id")
    private long boardId;

    @Column(name = "board_name")
    private String boardName;

    @Column(name = "project_name")
    @OneToOne
    @JoinColumn(name = "kanbanBoard")
    private Project projectName;

    @Column(name = "teamq")
    @OneToOne(mappedBy = "kanbanBoard", cascade = CascadeType.ALL)
    private List<Team> team;

    @Column(name = "assigned_task")
    @OneToMany(mappedBy = "kanbanBoard", cascade = CascadeType.ALL)
    private List<Task> assignedTask;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
}
