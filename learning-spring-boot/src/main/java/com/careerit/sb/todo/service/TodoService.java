package com.careerit.sb.todo.service;

import com.careerit.sb.todo.domain.TodoItem;

import java.util.List;

public interface TodoService {

        TodoItem addTodoItem(TodoItem todoItem);
        List<TodoItem> getTodos();
}
