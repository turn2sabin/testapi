package com.example.demo.Service;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

@RestController
@Component
@RequestMapping(value = "/register")
public class RegistrationService {
    private int userIdCount=1;
    private List<User> userList= new CopyOnWriteArrayList<>();

    public User addUser(User user){
        user.setId(userIdCount);
        userList.add(user);
        userIdCount++;
        return user;
    }




}






