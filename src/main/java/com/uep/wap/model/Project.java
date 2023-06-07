package com.uep.wap.model;
import java.util.List;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Projects")
public class Project{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ProjectId;


    private String projectName;


//    @ManyToMany(mappedBy = "projectsForUser")
//    private List<User> usersForProject;

    public Project(String projectName){
        this.projectName = projectName;
    }
//
//    @ManyToOne
//    @JoinColumn(name = "Team.project")
//    private Team assignedTeam;
//
//
//    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
//    private List<Report> projectReports;
//
//
//    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
//    private List<Task> tasksList;
//
//    @ManyToOne
//    @JoinColumn(name = "projects")
//    private AppProjectManagementII app;
//
//    @OneToOne(mappedBy = "projectName", cascade = CascadeType.ALL)
//    private KanbanBoard kanbanBoard;
//
//    @OneToOne
//    @JoinColumn(name = "project")
//    private Dashboard dashboard;


}