//package com.uep.wap.controller;
//
//import com.uep.wap.dto.UserDTO;
//import com.uep.wap.model._User;
//import com.uep.wap.service._UsersService;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping(path = "/api")
//public class _UserController {
//
//    private final _UsersService usersService;
//
//    public _UserController(_UsersService usersService) {
//        this.usersService = usersService;
//    }
//
//    @GetMapping(path = "/users")
//    public Iterable<_User> getAllUsers(){
//        return usersService.getAllUsers();
//    }
//
//    @PostMapping(path = "/users")
//    public String addUsers(@RequestBody UserDTO userDTO){
//        usersService.addUser(userDTO);
//        return "User added!";
//    }
//
//    @PostMapping("/login")
//    public ResponseEntity<String> login(@RequestBody _User user) {
//        // Extract login and password from the User object
//        String email = user.getEmail();
//        String password = user.getPassword();
//
//        // Perform login authentication using the received credentials
//        // Implement your login logic here
//
//        if (usersService.authenticateUser(email, password)) {
//            return ResponseEntity.ok("Login successful!");
//        } else {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Login failed!");
//        }
//    }
//
//    @PostMapping("/signup")
//    public ResponseEntity<String> signup(@RequestBody _User user) {
//        if (usersService.createUser(user)) {
//            return ResponseEntity.ok("Signup successful!");
//        } else {
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("User already exists!");
//        }
//    }
//
//}
