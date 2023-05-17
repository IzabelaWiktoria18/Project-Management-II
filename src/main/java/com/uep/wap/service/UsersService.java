package com.uep.wap.service;

import com.uep.wap.dto.UserDTO;
import com.uep.wap.model.User;
import com.uep.wap.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
    @Autowired
    private UserRepository userRepository;

    public void addUser(UserDTO userDTO) {
        User user = new User();
        user.setApp(userDTO.getApp());
        user.setCalendar(userDTO.getCalendar());
        user.setDashboards(userDTO.getDashboards());
        user.seteMail(userDTO.geteMail());
        user.setListOfNotifications(userDTO.getListOfNotifications());
        user.setListOfProjects(userDTO.getListOfProjects());
        user.setListOfTeams(userDTO.getListOfTeams());
        user.setUserRole(userDTO.getUserRole());
        user.setUserSurname(userDTO.getUserSurname());
        user.setUserRole(userDTO.getUserRole());
        user.setTask(userDTO.getTask());
        userRepository.save(user);
        System.out.println("user added!");
    }

    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
    //get create update
}
