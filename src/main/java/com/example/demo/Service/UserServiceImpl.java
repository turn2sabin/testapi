package com.example.demo.Service;
import com.example.demo.model.User;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
       private UserRepository userRepository;
    @Autowired
    public UserServiceImpl(UserRepository theUserRepository){
        userRepository= theUserRepository;
    }
   @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(int theId) {
        Optional<User> result = userRepository.findById(theId);
        User theuser = null;
        if (result.isPresent()) {
            theuser = result.get();
        } else{ throw  new RuntimeException(("did not find -"+theId));}
       return theuser;
    }

    @Override
    public void saveUser(User theUser) {
        userRepository.save(theUser);
        }

    @Override
    public void deleteById(int theId) {
        userRepository.deleteById(theId);
    }


}
