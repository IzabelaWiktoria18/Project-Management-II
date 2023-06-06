package com.uep.wap.service;

import com.uep.wap.dto.UserDTO;
import com.uep.wap.model.Role;
import com.uep.wap.model.User;
import com.uep.wap.repository.RoleRepository;
import com.uep.wap.repository.UserRepository;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class UserServiceImplementation implements UserService
{
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    public User save(UserDTO userDTO)
    {
        Role role = roleRepository.findByRoleName(userDTO.getRole());

        User user = new User(userDTO.getLogin(), userDTO.getPassword(), userDTO.getEmail(), userDTO.getFirst_name(), userDTO.getLast_name(), Collections.singletonList(role));
        return userRepository.save(user);
    }

    private boolean isUserLoggedIn(HttpServletRequest request)
    {
        HttpSession session = request.getSession(false);
        return session != null && session.getAttribute("user") != null;
    }
}
