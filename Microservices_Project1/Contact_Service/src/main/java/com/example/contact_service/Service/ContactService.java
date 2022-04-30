package com.example.contact_service.Service;

import com.example.contact_service.Entity.Contact;

import java.util.List;

public interface ContactService {

    public List<Contact> getContactsOfUser(Long userId);
}
