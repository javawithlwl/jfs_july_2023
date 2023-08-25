package com.careerit.cbook.dao;

import com.careerit.cbook.domain.Contact;

import java.util.List;

public interface CbookDao {

        Contact addContact(Contact contact);
        List<Contact> getContacts();
        Contact updateContact(Contact contact);
        boolean deleteContact(String id);
        Contact getContact(long id);
        List<Contact> search(String str);
        long addContacts(List<Contact> contacts);

}
