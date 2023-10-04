package com.careerit.sb.todo.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "todo_item")
public class TodoItem {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        @Column(name="title")
        private String title;
        @Column(name="description")
        private String description;
        @Column(name="deleted")
        private boolean deleted;
}
