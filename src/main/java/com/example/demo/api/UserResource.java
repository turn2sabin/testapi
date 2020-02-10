package com.example.demo.api;

import com.example.demo.Service.RegistrationService;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( value="/users")
public class UserResource {

        @Autowired
        private RegistrationService registrationService;
        @PostMapping
        public User addUser(@RequestBody User user){
            return registrationService.addUser(user);
        }


    }

