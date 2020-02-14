package com.example.demo.api;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
@ComponentScan(basePackages = ("com.example.demo.api"))

@Controller
@RequestMapping(value="/welcome")
    public class HelloWorld {
    ModelAndView sayHello() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("welcomepage"); // resources/template/home.html
        return modelAndView;

    }
}
