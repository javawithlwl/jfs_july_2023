package com.careerit.todoapp.dto;

import com.careerit.todoapp.domain.Status;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TodoItemDto {
    private long id;
    private String title;
    private String description;
    private Status status;
}
