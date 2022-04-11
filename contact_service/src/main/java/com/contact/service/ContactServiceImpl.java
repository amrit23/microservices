package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    List<Contact> list  = Arrays.asList(
            new Contact(1L, "amrit@gmail.com", "Amrit", 1311L),
            new Contact(2L, "mohan@gmail.com", "Mohan", 1311L),
            new Contact(3L, "Sohan@gmail.com", "Sohan", 1312L),
            new Contact(4L, "Ravi@gmail.com", "Ravi", 1314L)
    );
    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return this.list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
