package com.example.userservice.Controller;


import com.example.userservice.Entity.Contact;
import com.example.userservice.Entity.User;
import com.example.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/userController")
public class UserController {
    @Autowired
    private UserService userService ;

   @Autowired
    private RestTemplate restTemplate;


    @RequestMapping("/{userId}")
    public User getUser(@PathVariable("userId") Long userId){
        User user =userService.getUser(userId);
        List<Contact> litsContacts= restTemplate.getForObject("http://contact-service/contactController/user/"+user.getUserId(),List.class);
        user.setContacts(litsContacts);
          return user;


    }
}
