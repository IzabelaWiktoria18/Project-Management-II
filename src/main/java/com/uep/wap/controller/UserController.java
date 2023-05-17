package com.uep.wap.controller;

import com.uep.wap.dto.UserDTO;
import com.uep.wap.dto.UsersDataDTO;
import com.uep.wap.model.User;
import com.uep.wap.service.UsersService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class UserController {

    private final UsersService usersService;

    public UserController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping(path = "/hello")
    public String sayHello(){
        return "Hello!";
    }

    @GetMapping(path = "/users")
    public Iterable<User> getAllUsers(){
        return usersService.getAllUsers();
    }

    @PostMapping(path = "/users")
    public String addUsers(@RequestBody UserDTO userDTO){
        usersService.addUser(userDTO);
        return "User added!";
    }
}
