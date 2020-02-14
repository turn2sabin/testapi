package com.example.demo.Service;

import com.example.demo.model.LoginInfo;
import com.example.demo.model.User;
import com.example.demo.repositories.LoginRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public class LoginServiceImpl  implements LoginService {
    private LoginRepository loginRepository;
    @Autowired
    public LoginServiceImpl(LoginRepository theLoginRepository){
        loginRepository= theLoginRepository;
    }
    @Override
    public List<LoginInfo> findAll() {
        return loginRepository.findAll();
    }

    @Override
    public LoginInfo findById(int theId) {
        Optional<LoginInfo> result = loginRepository.findById(theId);
        LoginInfo theloginInfo = null;
        if (result.isPresent()) {
            theloginInfo = result.get();
        } else{ throw  new RuntimeException(("did not find -"+theId));}
        return theloginInfo;
    }

    @Override
    public void save(LoginInfo theLoginInfo) {

        loginRepository.save(theLoginInfo);

    }

    @Override
    public void deleteById(int theId) {
        loginRepository.deleteById(theId);
    }

    @Override
    public LoginInfo findByUsername(String username) {
        Optional<LoginInfo> result = Optional.ofNullable(loginRepository.findByUsername(username));
        LoginInfo theloginInfo = null;
        if (result.isPresent()) {
            theloginInfo = result.get();
        } else{ throw  new RuntimeException(("did not find -"+username));}
        return theloginInfo;

    }


}
