package com.w2x.ssm.controller;

import com.w2x.ssm.entity.User;
import com.w2x.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/addUser")
    public ModelAndView addUser(User user, ModelAndView modelAndView) {
        userService.addUser(user);
        modelAndView.addObject("msg", "add successful");
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping("/delUser")
    public ModelAndView delUser(ModelAndView modelAndView) {
        userService.delUser(2);
        modelAndView.addObject("msg", "delete successful");
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping("/updateUser")
    public ModelAndView updateUser(ModelAndView modelAndView) {
        User user = new User();
        user.setId(4);
        user.setUsername("tony");
        user.setAge(20);
        user.setGender("female");
        userService.updateUser(user);
        modelAndView.addObject("msg", "update successful");
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping("/findAll")
    public ModelAndView findAll(ModelAndView modelAndView) {
        List<User> users = userService.findAll();
        System.out.println(users);
        modelAndView.addObject("msg", "search successful");
        modelAndView.setViewName("success");
        return modelAndView;
    }

}
