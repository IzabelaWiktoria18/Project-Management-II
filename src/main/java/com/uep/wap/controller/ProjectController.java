package com.uep.wap.controller;

import com.uep.wap.dto.ProjectDTO;
import com.uep.wap.dto.ProjectsDataDTO;
import com.uep.wap.dto.UserDTO;
import com.uep.wap.model.Project;
import com.uep.wap.model.Role;
import com.uep.wap.model.Team;
import com.uep.wap.model.User;
import com.uep.wap.repository.ProjectRepository;
import com.uep.wap.repository.TeamRepository;
import com.uep.wap.service.ProjectsService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping(path = "/project")
public class ProjectController {

    private final ProjectsService projectsService;
    private final TeamRepository teamRepository;

    public ProjectController(ProjectsService projectsService, TeamRepository teamRepository) {
        this.projectsService = projectsService;
        this.teamRepository = teamRepository;
    }

//    @GetMapping(path = "/hello")
//    public String sayHello(){
//        return "Hello!";
//    }

    @GetMapping(path = "/all")
    public Iterable<Project> getAllProjects(){
        return projectsService.getAllProjects();
    }

    @PostMapping
    public String addProjects(@ModelAttribute("project") ProjectDTO projectDTO){
        projectsService.addProject(projectDTO);
        return "Project added!";
    }

    @GetMapping
    private String registerPage(Model model, HttpServletRequest request)
    {


        Iterable<Team> availableTeams = teamRepository.findAll();

        model.addAttribute("projects", new ProjectDTO());
        model.addAttribute("availableTeams", availableTeams);
        return "create_project";
    }

//    @GetMapping(path = "/create-project")
//    public String createProject(){
//        return "create_project";
//    }
}
