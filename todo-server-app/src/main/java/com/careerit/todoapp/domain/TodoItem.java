package com.careerit.todoapp.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "todo_item")
@Getter
@Setter
public class TodoItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "title",nullable = false)
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private Status status = Status.IN_PROGRESS;

    @PrePersist
    public void prePersists(){
        if(this.status == null){
            this.status = Status.IN_PROGRESS;
        }
    }
}
