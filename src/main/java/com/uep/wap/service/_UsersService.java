//package com.uep.wap.service;
//
//import com.uep.wap.dto.UserDTO;
//import com.uep.wap.model.User;
//import com.uep.wap.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class _UsersService {
//    @Autowired
//    private UserRepository userRepository;
//
//    public void addUser(UserDTO userDTO) {
//        User user = new User();
//        user.setApp(userDTO.getApp());
//        user.setCalendar(userDTO.getCalendar());
//        user.setDashboards(userDTO.getDashboards());
//        user.setEmail(userDTO.geteMail());
//        user.setListOfNotifications(userDTO.getListOfNotifications());
//        user.setListOfProjects(userDTO.getListOfProjects());
//        user.setListOfTeams(userDTO.getListOfTeams());
//        user.setUserRole(userDTO.getUserRole());
//        user.setUserSurname(userDTO.getUserSurname());
//        user.setUserRole(userDTO.getUserRole());
//        user.setTask(userDTO.getTask());
//        userRepository.save(user);
//        System.out.println("user added!");
//    }
//
//    public Iterable<User> getAllUsers() {
//        return userRepository.findAll();
//    }
//    //get create update
//
//    public boolean authenticateUser(String email, String password) {
//        User user = userRepository.findByEmail(email);
//
//        if (user != null && user.getPassword().equals(password)) {
//            return true; // Authentication successful
//        } else {
//            return false; // Authentication failed
//        }
//    }
//
//    public boolean createUser(User user) {
//        // Check if the email already exists in the database
//        if (userRepository.findByEmail(user.getEmail()) != null) {
//            return false; // User with the same email already exists
//        }
//
//        // Additional validation and business logic, if needed
//
//        // Save the new user to the database
//        userRepository.save(user);
//        return true; // User created successfully
//    }
//
//}
