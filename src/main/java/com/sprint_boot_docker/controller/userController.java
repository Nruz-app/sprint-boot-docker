package com.sprint_boot_docker.controller;


import com.sprint_boot_docker.domain.dtos.request.UserRequest;
import com.sprint_boot_docker.domain.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class userController {


    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public ResponseEntity<UserRequest> getUser(){

        UserRequest user = this.userService.getUser();
        return ResponseEntity.ok(user);
    }
}
