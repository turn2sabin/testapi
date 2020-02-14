package com.example.demo.Service;
import com.example.demo.model.User;
import com.example.demo.repositories.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public interface UserService {
    public List<User> findAll();
    public User findById(int theId);
    public void saveUser(User theUser);
    public void deleteById(int theId);


}
