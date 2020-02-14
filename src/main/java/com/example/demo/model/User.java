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
@Table(name = "user")
public class User {

    private int id;
    private String name;
    private String lastName;
    private int courseid;
    private int age;
    private String username;
    private String password;


    public User(){}

    public User(String name, String lastName, int courseid, int age, String username, String password) {
        this.name = name;
        this.lastName = lastName;
        this.courseid = courseid;
        this.age = age;
        this.username = username;
        this.password = password;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Column(name = "first_name", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Column(name = "last_name", nullable = false)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @Column(name = "course_id", nullable = false)
    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) { this.courseid= courseid; }


    @Column(name = "age", nullable = false)
    public int getAge() {return age; }

    public void setAge(int age) {
        this.age = age;
    }

    @Column(name="username", nullable= false)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
@Column(name="password", nullable = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", courseid=" + courseid +
                ", age=" + age +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

