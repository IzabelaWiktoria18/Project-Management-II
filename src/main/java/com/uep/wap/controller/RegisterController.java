package com.uep.wap.controller;

import com.uep.wap.dto.UserDTO;
import com.uep.wap.model.Role;
import com.uep.wap.model.User;
import com.uep.wap.repository.RoleRepository;
import com.uep.wap.repository.UserRepository;
import com.uep.wap.service.UserServiceImplementation;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping(path = "/register")
public class RegisterController
{
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private UserServiceImplementation userService;

    @Autowired
    public RegisterController(UserRepository userRepository, UserServiceImplementation userService, RoleRepository roleRepository)
    {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.userService = userService;
    }

    private boolean isUserLoggedIn(HttpServletRequest request)
    {
        HttpSession session = request.getSession(false);
        return session != null && session.getAttribute("user") != null;
    }

    @GetMapping
    private String registerPage(Model model, HttpServletRequest request)
    {
        if (isUserLoggedIn(request))
        {
            return "redirect:/";
        }

        List<Role> availableRoles = roleRepository.findAllByRoleNameNot("Administrator");

        model.addAttribute("users", new UserDTO());
        model.addAttribute("availableRoles", availableRoles);
        return "register";
    }

    @PostMapping
    private String addAccount(@ModelAttribute("user")UserDTO userDTO, RedirectAttributes redirectAttributes)
    {
        List<User> usersFromDatabaseLOGIN = userRepository.findByLogin(userDTO.getLogin());
        List<User> usersFromDatabaseEMAIL = userRepository.findByEmail(userDTO.getEmail());

        if (!usersFromDatabaseLOGIN.isEmpty())
        {
            redirectAttributes.addAttribute("warning_login", true);
            return "redirect:/register";
        }

        if(!usersFromDatabaseEMAIL.isEmpty())
        {
            redirectAttributes.addAttribute("warning_email", true);
            return "redirect:/register";
        }

        User user = userService.save(userDTO);

        if (userDTO.getRole().equals("Course_coordinator"))
        {
            return "redirect:/register-notification";
        }
        else
        {
            return "redirect:/sign-in";
        }
    }
}
