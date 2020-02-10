package com.example.demo.model;
import org.springframework.stereotype.Component;

import javax.management.relation.Role;
import javax.persistence.*;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Component
@Entity
@Table(name = "loginInfo")
public class LoginInfo {

    @OneToOne
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
