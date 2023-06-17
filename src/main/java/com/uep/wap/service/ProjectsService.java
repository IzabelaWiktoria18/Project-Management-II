package com.uep.wap.service;

import com.uep.wap.dto.ProjectDTO;
import com.uep.wap.dto.UserDTO;
import com.uep.wap.model.Project;
import com.uep.wap.model.Role;
import com.uep.wap.model.User;
import com.uep.wap.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;

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
    public Project save(ProjectDTO projectDTO)
    {
        System.out.println(projectDTO.getProjectName());
        Project project  = new Project(projectDTO.getProjectName());


        return projectRepository.save(project);
    }
}
