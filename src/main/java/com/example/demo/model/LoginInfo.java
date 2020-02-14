package com.example.demo.model;
import org.springframework.stereotype.Component;

import javax.management.relation.Role;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
@Component
@Entity
@Table(name = "login_info")

public class LoginInfo {
    private int id;
    private String username;
    private String password;

@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user.id")
    private int user_id;

    public LoginInfo(){}

    public LoginInfo(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Column(name = "username", nullable = false, unique = true)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "password", nullable = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginInfo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", user_id=" + user_id +
                '}';
    }
}
