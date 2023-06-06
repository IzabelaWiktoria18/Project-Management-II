package com.uep.wap.controller;

import com.uep.wap.dto.ProjectDTO;
import com.uep.wap.dto.ProjectsDataDTO;
import com.uep.wap.model.Project;
import com.uep.wap.service.ProjectsService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class ProjectController {

    private final ProjectsService projectsService;

    public ProjectController(ProjectsService projectsService) {
        this.projectsService = projectsService;
    }

//    @GetMapping(path = "/hello")
//    public String sayHello(){
//        return "Hello!";
//    }

    @GetMapping(path = "/projects")
    public Iterable<Project> getAllProjects(){
        return projectsService.getAllProjects();
    }

    @PostMapping(path = "/students")
    public String addProjects(@RequestBody ProjectDTO projectDTO){
        projectsService.addProject(projectDTO);
        return "Project added!";
    }
}
