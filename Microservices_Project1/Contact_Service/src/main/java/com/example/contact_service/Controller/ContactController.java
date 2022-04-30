package com.example.contact_service.Controller;

import com.example.contact_service.Entity.Contact;
import com.example.contact_service.Service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contactController")
public class ContactController {


    @Autowired
    private ContactService contactService;

    @RequestMapping("/user/{userId}")
    public List<Contact> getContacts(@PathVariable("userId") Long userId){

          return  this.contactService.getContactsOfUser(userId);

    }
}
