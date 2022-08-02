package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    //lets create the contact list......
    List<Contact> list = List.of(
          new Contact(1L, "john@gmail.com", "John", 2001L),
            new Contact(2L, "mary@gmail.com", "mary", 2002L),
            new Contact(3L, "emma@gmail.com", "emma", 2001L),
            new Contact(4L, "girish@gmail.com", "girish", 2003L),
            new Contact(5L, "amit@gmail.com", "amit", 2004L),
            new Contact(6L, "lokendra@gmail.com", "lokendra", 2002L),
            new Contact(6L, "abhay@gmail.com", "Abhay", 2002L)
    );

    @Override
    public List<Contact> getContactOfUser(Long id) {
        return this.list.stream().filter(contact ->
                contact.getUserId().equals(id)).
                collect(Collectors.toList());
    }
}
