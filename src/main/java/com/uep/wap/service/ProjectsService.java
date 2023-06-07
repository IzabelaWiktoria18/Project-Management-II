package com.uep.wap.service;

import com.uep.wap.dto.ProjectDTO;
import com.uep.wap.model.Project;
import com.uep.wap.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ProjectsService {

    @Autowired
    private ProjectRepository projectRepository;

    public void addProject(ProjectDTO projectDTO) {
        Project project = new Project();
//        project.setApp(projectDTO.getApp());
        project.setProjectName(projectDTO.getProjectName());
//        project.setProjectReports(projectDTO.getProjectReports());
//        project.setAssignedTeam(projectDTO.getAssignedTeam());
//        project.setKanbanBoard(projectDTO.getKanbanBoard());
//        project.setTasksList(projectDTO.getTasksList());
//        project.setUsersList(projectDTO.getUsersList());
//        project.setDashboard(projectDTO.getDashboard());
        projectRepository.save(project);
        System.out.println("Project added!");
    }

    public Iterable<Project> getAllProjects() {
        return projectRepository.findAll();
    }
    //get create update
}
