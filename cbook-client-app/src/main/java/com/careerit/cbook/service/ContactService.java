package com.careerit.cbook.service;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import com.careerit.cbook.dto.ContactDto;

import java.util.List;

@Service
public class ContactService {

    private RestClient restClient;

    public ContactService() {
        restClient = RestClient.builder()
                .baseUrl("https://cbook-server-app.onrender.com/api/")
                .build();
    }

    public List<ContactDto> getAllContacts() {
        return this.restClient.get()
                .uri("contact/all")
                .retrieve()
                .body(new ParameterizedTypeReference<List<ContactDto>>() {
                });
    }

    public ContactDto addContact(ContactDto contactDto) {
        return this.restClient.post()
                .uri("contact")
                .contentType(MediaType.APPLICATION_JSON)
                .body(contactDto)
                .retrieve()
                .body(ContactDto.class);
    }
    public void deleteContact(String id){
        this.restClient.delete()
                .uri("contact/{id}",id)
                .retrieve()
                .body(Void.class);
    }
    public ContactDto updateContact(ContactDto contactDto){
        return this.restClient.put()
                .uri("contact")
                .contentType(MediaType.APPLICATION_JSON)
                .body(contactDto)
                .retrieve()
                .body(ContactDto.class);
    }
    public List<ContactDto> search(String str){
        return this.restClient.get()
                .uri("contact/search?str={str}",str)
                .retrieve()
                .body(new ParameterizedTypeReference<List<ContactDto>>() {
                });
    }
    public ContactDto getContact(String id){
        return this.restClient.get()
                .uri("contact/{id}",id)
                .retrieve()
                .body(ContactDto.class);
    }
}
