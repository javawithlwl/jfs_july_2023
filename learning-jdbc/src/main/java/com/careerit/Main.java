package com.careerit;

import com.careerit.cbook.dao.CbookDao;
import com.careerit.cbook.dao.CbookDaoImpl;
import com.careerit.cbook.domain.Contact;

import java.io.IOException;
import java.sql.*;
import java.util.List;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException {

        CbookDao contactDao = new CbookDaoImpl();
        /*List<Contact> contactList = contactDao.search("sa");
        contactList.forEach(ele->{
            System.out.println(ele.getName());
        });*/

        Contact contact = Contact.builder()
                .name("Tanvi")
                .mobile("9999999999")
                .email("tanvi.a@gmail.com")
                .build();

        Contact savedContact = contactDao.addContact(contact);
        System.out.println("Contact is saved with id :"+savedContact.getId());
    }
}