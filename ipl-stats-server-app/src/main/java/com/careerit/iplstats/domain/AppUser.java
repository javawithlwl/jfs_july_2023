package com.careerit.iplstats.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "app_user")
@Getter
@Setter
public class AppUser {

        @Id
        @Column(name = "id")
        private UUID id;
        @Column(name = "username")
        private String username;
        @Column(name = "password")
        private String password;
        @Column(name = "email")
        private String email;

        @PrePersist
        public void prePersist(){
            this.id = UUID.randomUUID();
        }
}
