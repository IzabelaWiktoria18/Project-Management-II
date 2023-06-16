package com.uep.wap.dto;

import com.uep.wap.model.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ProjectDTO {
    private String projectName;
    private List<User> usersList;
    private Team assignedTeam;
    private List<Report> projectReports;
    private List<Task> tasksList;
//    private AppProjectManagementII app;
//    private KanbanBoard kanbanBoard;
//    private Dashboard dashboard;

    public ProjectDTO(){}

    public ProjectDTO(String projectName, Team assignedTeam){
        this.projectName = projectName;
        this.assignedTeam = assignedTeam;
    }


}
