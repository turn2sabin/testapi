package com.example.demo.Service;
import com.example.demo.model.LoginInfo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface LoginService {

        public List<LoginInfo> findAll();
        public LoginInfo findById(int theId);
        public void save(LoginInfo theLoginInfo);
        public void deleteById(int theId);
        public LoginInfo findByUsername(String username);
}
