package com.careerit.todoapp.service;

import com.careerit.todoapp.dto.TodoItemDto;

import java.util.List;

public interface TodoItemService {
    TodoItemDto addNewTodoItem(TodoItemDto todoItemDto);

    List<TodoItemDto> getAllTodoItems();

    TodoItemDto updateTodoItem(TodoItemDto todoItemDto);

    boolean deleteTodoItem(long id);

    TodoItemDto getTodoItemById(long id);
}
