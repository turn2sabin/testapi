package com.example.demo.repositories;

import com.example.demo.model.LoginInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<LoginInfo, Integer> {
    LoginInfo findByUsername(String username);
    }


