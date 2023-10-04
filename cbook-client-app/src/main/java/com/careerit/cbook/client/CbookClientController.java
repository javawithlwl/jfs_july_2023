package com.careerit.cbook.client;

import com.careerit.cbook.dto.ContactDto;
import com.careerit.cbook.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cbook")
public class CbookClientController {

        @Autowired
        private ContactService contactService;

        @GetMapping("/all")
        public ResponseEntity<List<ContactDto>> getAllContacts(){
               return ResponseEntity.ok(contactService.getAllContacts());
        }
        @PostMapping("/add")
        public ResponseEntity<ContactDto> addContact(@RequestBody ContactDto contactDto){
                return ResponseEntity.ok(contactService.addContact(contactDto));
        }
        @GetMapping("/{id}")
        public ResponseEntity<ContactDto> getContact(@PathVariable("id") String id){
                return ResponseEntity.ok(contactService.getContact(id));
        }
        @PutMapping("/update")
        public ResponseEntity<ContactDto> updateContact(@RequestBody ContactDto contactDto){
                return ResponseEntity.ok(contactService.updateContact(contactDto));
        }
        @DeleteMapping("/{id}")
        public ResponseEntity<Void> deleteContact(@PathVariable("id") String id){
                contactService.deleteContact(id);
                return ResponseEntity.ok().build();
        }
        @GetMapping("/search/{str}")
        public ResponseEntity<List<ContactDto>> search(@PathVariable("str") String str){
                return ResponseEntity.ok(contactService.search(str));
        }
}
