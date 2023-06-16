package com.uep.wap.controller;

import com.uep.wap.model.Project;
import com.uep.wap.model.Role;
import com.uep.wap.repository.ProjectRepository;
import com.uep.wap.repository.UserRepository;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Controller
public class UserController
{
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ProjectRepository projectRepository;

    private boolean isUserLoggedIn(HttpServletRequest request)
    {
        HttpSession session = request.getSession(false);
        return session != null && session.getAttribute("user") != null;
    }

    @GetMapping(path = "/panel")
    public String panel(Model model, HttpServletRequest request)
    {
        if (!isUserLoggedIn(request))
        {
            return "redirect:/";
        }

        model.addAttribute("users", userRepository.findAll());
        return "panel";
    }

    @GetMapping(path = "/calendar")
    public String calendar(HttpServletRequest request)
    {
        if (!isUserLoggedIn(request))
        {
            return "not_logged";
        }
        return "calendar";
    }
    @GetMapping(path = "/notifications")
    public String notifications(HttpServletRequest request)
    {
        if (!isUserLoggedIn(request))
        {
            return "not_logged";
        }
        return "notifications";
    }
    @GetMapping(path = "/projects")
    public String projects(Model model, HttpServletRequest request)
    {
        if (!isUserLoggedIn(request))
        {
            return "not_logged";
        }

        List<Project> currentProjects = new ArrayList<>();
        projectRepository.findAll().forEach(currentProjects::add);
        model.addAttribute("currentProjects", currentProjects);
        return "projects";
    }

    @GetMapping(path = "/tasks")
    public String tasks(HttpServletRequest request)
    {
        if (!isUserLoggedIn(request))
        {
            return "not_logged";
        }
        return "tasks";
    }

    @GetMapping(path = "/reports")
    public String reports(HttpServletRequest request)
    {
        if (!isUserLoggedIn(request))
        {
            return "not_logged";
        }
        return "reports";
    }
}
