package com.example.demo.api;
import com.example.demo.Service.UserService;
//import com.example.demo.Service.UserServiceImpl;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserRestController {
    private UserService userService;

    @Autowired
    public UserRestController(UserService theUserService){
        userService= theUserService;
    }

    @GetMapping("/users")
    public List<User> findAll(){
        return userService.findAll();
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable int id){
        User theUser= userService.findById(id);
        if(theUser==null){
            throw new RuntimeException("ID not found -"+ id);
        }
        return theUser;
    }

    @PostMapping("/save_user")
    public String addUser(@RequestParam String name, @RequestParam String lastName, @RequestParam int courseid,@RequestParam int age, @RequestParam String username, @RequestParam String password){
        System.out.println(name+lastName+courseid+age  +username);
        User theUser=new User( name,lastName, courseid, age, username, password);
        userService.saveUser(theUser);
        String s= "User Saved";
        return s;
    }

    @RequestMapping(value="/hello")
    public ModelAndView sayHello(HttpServletRequest request){
        request.setAttribute("mode", "MODE_HOME");
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("welcomepage"); // resources/template/home.html
        return modelAndView;
//        try {
//            return "welcome";
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//            return e.getMessage();
//        }
////        return new ModelAndView("welcome");


    }
    @RequestMapping("/register")
    public ModelAndView registration(HttpServletRequest request){
        request.setAttribute("mode", "MODE_REGISTER");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("welcomepage"); // resources/template/home.html
        return modelAndView;

    }
    @PostMapping("/save-user")
    public ModelAndView registerUser(@ModelAttribute User user, BindingResult bindingResult, HttpServletRequest request){
        userService.saveUser(user);
        request.setAttribute("mode", "MODE_HOME");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("welcomepage"); // resources/template/home.html
        return modelAndView;
    }

}
