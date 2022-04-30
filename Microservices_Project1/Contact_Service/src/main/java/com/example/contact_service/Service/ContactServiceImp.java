package com.example.contact_service.Service;

import com.example.contact_service.Entity.Contact;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class ContactServiceImp implements ContactService {


    List<Contact> contacts =List.of(new Contact(1L,"Ravi@gmail.com","Ravi",1311L),
            new Contact(2L,"baba@gmail.com","baba",1312L)
            );
    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return contacts.stream().filter(contact->contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
