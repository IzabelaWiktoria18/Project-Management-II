package com.uep.wap.controller;

import com.uep.wap.dto.UserDTO;
import com.uep.wap.model.User;
import com.uep.wap.repository.UserRepository;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class SigninController
{
    @Autowired
    private UserRepository userRepository;

    private boolean isUserLoggedIn(HttpServletRequest request)
    {
        HttpSession session = request.getSession(false);
        return session != null && session.getAttribute("user") != null;
    }

    @GetMapping(path = "/sign-in")
    public String signinPage(Model model, HttpServletRequest request)
    {
        if (isUserLoggedIn(request))
        {
            return "redirect:/";
        }

        model.addAttribute("users", new UserDTO());
        return "login";
    }

    @PostMapping("/sign-in")
    public String session(@ModelAttribute("user") UserDTO userDTO, HttpSession session, RedirectAttributes redirectAttributes)
    {
        List<User> usersFromDatabase = userRepository.findByLogin(userDTO.getLogin());

        if (usersFromDatabase.isEmpty())
        {
            redirectAttributes.addAttribute("warning_login", true);
            return "redirect:/sign-in";
        }

        User user = usersFromDatabase.get(0);
        if (user.getPassword().equals(userDTO.getPassword()))
        {
            session.setAttribute("user", user);
            return "redirect:/";
        }
        else
        {
            redirectAttributes.addAttribute("warning_password", true);
            return "redirect:/sign-in";
        }
    }

    @RequestMapping(value = "/logout", method = {RequestMethod.GET, RequestMethod.POST})
    public String logout(HttpSession session)
    {
        session.invalidate();
        return "redirect:/sign-in";
    }
}
