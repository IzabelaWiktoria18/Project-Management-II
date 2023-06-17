package com.uep.wap.service;

import com.uep.wap.dto.UserDTO;
import com.uep.wap.model.Project;
import com.uep.wap.model.Role;
import com.uep.wap.model.User;
import com.uep.wap.repository.ProjectRepository;
import com.uep.wap.repository.RoleRepository;
import com.uep.wap.repository.UserRepository;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImplementation implements UserService
{
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private ProjectRepository projectRepository;

    public User save(UserDTO userDTO)
    {
        Role role = roleRepository.findByRoleName(userDTO.getRole());
        Optional<Project> opt;
        if (userDTO.getProject() == null){
            long num1 = -1;
            opt = projectRepository.findById( num1 );
        }else{
        opt = projectRepository.findById(userDTO.getProject());}

        User user = new User(userDTO.getLogin(), userDTO.getPassword(), userDTO.getEmail(), userDTO.getFirst_name(),
                userDTO.getLast_name(), Collections.singletonList(role), new  ArrayList());
        if (opt.isPresent()){
            Project project = opt.get();
            user.setProjectsForUser(Collections.singletonList(project));
        }

        return userRepository.save(user);
    }


    private boolean isUserLoggedIn(HttpServletRequest request)
    {
        HttpSession session = request.getSession(false);
        return session != null && session.getAttribute("user") != null;
    }

    public User addProjectToUser(User user, long projectId){
        List<Project> projects = user.getProjectsForUser();
        Optional<Project> opt = projectRepository.findById(projectId);
        if (opt.isPresent()) {
            Project project = opt.get();
            projects.add(project);
//            project.getUsersList().add(user); // Add the user to the project's usersList collection
        }

//        User userToAdd = new User(user.getLogin(), user.getPassword(), user.getEmail(), user.getFirst_name(),
//                user.getLast_name(), user.getRoles(), projects);
        userRepository.save(user);
        return user;
    }
}
