package com.example.demo.DAO;

import com.example.demo.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



public interface UserDao extends CrudRepository<User, Integer> {


}
