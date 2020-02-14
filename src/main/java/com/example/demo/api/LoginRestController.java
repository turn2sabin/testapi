package com.example.demo.api;
import com.example.demo.Service.LoginService;
import com.example.demo.Service.UserService;
import com.example.demo.model.LoginInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@ComponentScan ("com.example.demo.Service.LoginService")
@RestController
@RequestMapping("/login")
public class LoginRestController {
    private LoginService loginService;


    @GetMapping("/logins")
    public List<LoginInfo> findAll(){
        return loginService.findAll();
    }


    @GetMapping("/loginapi/{id}")
    public LoginInfo getLoginInfo(@PathVariable int id) {
        LoginInfo theLoginInfo = loginService.findById(id);
        if (theLoginInfo == null) {
            throw new RuntimeException("ID not found -" + id);
        }
        return theLoginInfo;
    }
    @GetMapping("/loginapi/{username}")
    public LoginInfo getLoginInfo(@PathVariable String username){
        LoginInfo theLoginInfo= loginService.findByUsername(username);
        if(theLoginInfo==null){
            throw new RuntimeException("ID not found -"+ username);
        }
        return theLoginInfo;
    }

    @PostMapping("/loginapi")
    public LoginInfo addLoginInfo(@RequestBody LoginInfo theLoginInfo){
        loginService.save(theLoginInfo);
        return theLoginInfo;
    }

}
