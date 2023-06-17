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

    @OneToMany(mappedBy = "reportProject", cascade = CascadeType.ALL)
    private List<Report> projectReports;
//    private List<User> usersList;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team projectTeam;

    @OneToMany(mappedBy = "projectForTask", cascade = CascadeType.ALL)
    private List<Task> tasksList;


//    @ManyToMany(mappedBy = "projectsForUser")


    @Override
    public boolean equals(Object obj) {
        Project project = (Project) obj;
        return this.ProjectId == project.ProjectId;
    }

    public Project(String projectName){
        this.projectName = projectName;
    }
//
//    @ManyToOne
//    @JoinColumn(name = "Team.project")

//
//
//    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL)

//
//
//    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL)

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