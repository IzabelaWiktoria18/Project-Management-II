package main.java.com.uep.wap.model;


import main.java.com.uep.wap.model.Team;

import java.util.List;

@Entity
@Table(name = "Projects")
public class Project{

    @Id
    @Column(name = "project_id")
    private long ProjectId;

    @Column(name = "project_name")
    private String projectName;

    @Column(name = "users_list")
    private List<User> usersList;

    @Column(name = "assigned_team")
    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
    private Team assignedTeam;

    @Column(name = "project_reports")
    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
    private List<Report> projectReports;

    @Column(name = "tasks_list")
    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
    private List<Task> tasksList;
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @ManyToOne
    @JoinColumn(name = "app_id")
    @Column(name = "app")
    private AppProjectManagementII app;

    @OneToOne(mappedBy = "project_name", cascade = CascadeType.ALL)
    @Column(name = "kanbanBoard")
    private KanbanBoard kanbanBoard;

}