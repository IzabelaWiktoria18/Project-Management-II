package com.uep.wap.controller;


import com.uep.wap.dto.ProjectDTO;
import com.uep.wap.dto.UserDTO;
import com.uep.wap.model.Project;
import com.uep.wap.model.Role;
import com.uep.wap.model.User;
import com.uep.wap.repository.ProjectRepository;
import com.uep.wap.repository.RoleRepository;
import com.uep.wap.repository.UserRepository;
import com.uep.wap.service.ProjectsService;
import com.uep.wap.service.UserService;
import com.uep.wap.service.UserServiceImplementation;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.CollectionUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Controller
@RequestMapping(path = "/panel")
public class AdddProjController {
    private final ProjectRepository projectRepository;
    private final RoleRepository roleRepository;
    private UserServiceImplementation userService;

    @Autowired
    public AdddProjController(ProjectRepository userRepository, UserServiceImplementation userService, RoleRepository roleRepository, ProjectRepository projectRepository)
    {
        this.projectRepository = userRepository;
        this.roleRepository = roleRepository;
        this.userService = userService;
//        this.roleRepository.save(new Role("Project Manager"));
//        this.roleRepository.save(new Role("Team Member"));
//        this.roleRepository.save(new Role("Client"));
//        this.roleRepository.delete(this.roleRepository.findByRoleName("User"));
//        projectRepository.save(new Project("Project 2 - Big Piano"));
//        List<User> userList = this.userRepository.findByLogin("Izabela");
//        User user  = userList.get(0);
////        long id = 0;
//        ArrayList projectList = (ArrayList) projectRepository.findAll();
//        Project project = (Project) projectList.get(1);
//        List<Project> prol = user.getProjectsForUser();
//        prol.add(project);
//        user.setProjectsForUser(prol);
//        this.userRepository.save(user);
//        if (projectList.isPresent()){
//            System.out.println(projectList.get().getProjectName());
//
//            prol.add(projectList.get());
//            user.setProjectsForUser(prol);
//        }
//        this.userRepository.save(user);
//        Project project = user.getProjectsForUser().get(0);
//        System.out.println(project.getProjectName());
//        System.out.println(user.getFirstProjectName());
    }

    private boolean isUserLoggedIn(HttpServletRequest request)
    {
        HttpSession session = request.getSession(false);
        return session != null && session.getAttribute("user") != null;
    }

    @GetMapping
    private String registerPage(Model model, HttpServletRequest request)
    {
        HttpSession session = request.getSession(false);
        User user = (User)session.getAttribute("user");
        List<Project> currentProjects = new ArrayList<>();
        projectRepository.findAll().forEach(currentProjects::add);
        CollectionUtils.filter(currentProjects, o -> ((Project) o).getProjectName() != null);
        CollectionUtils.filter(currentProjects, o -> !user.getProjectsForUser().contains((Project) o) );
        model.addAttribute("currentProjectsToAdd", currentProjects);
        model.addAttribute("userToAdd", new UserDTO());
        return "panel";
    }

    @PostMapping
    private String addAccount(@ModelAttribute("user") UserDTO userDTO, HttpServletRequest request)
    {
        HttpSession session = request.getSession(false);
        User user = (User)session.getAttribute("user");
        long project = userDTO.getProject();
        User user2 = userService.addProjectToUser(user, project);
        return "redirect:/panel";
    }


}

