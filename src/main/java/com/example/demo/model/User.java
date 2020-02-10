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

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    public int getAge(int age) {return age; }

    public void setAge(int age) {
        this.age = age;
    }



}

