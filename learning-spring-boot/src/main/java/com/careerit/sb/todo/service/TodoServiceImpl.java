package com.careerit.sb.todo.service;

import com.careerit.sb.todo.dao.TodoItemRepo;
import com.careerit.sb.todo.domain.TodoItem;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class TodoServiceImpl implements TodoService{

    @Autowired
    private TodoItemRepo todoItemRepo;

    @Override
    public TodoItem addTodoItem(TodoItem todoItem) {
        TodoItem createTodoItem = todoItemRepo.save(todoItem);
        log.info("Todo is created with id :{}",createTodoItem.getId());
        return createTodoItem;
    }

    @Override
    public List<TodoItem> getTodos() {
       List<TodoItem> todoItemList = todoItemRepo.findActiveTodos();
       log.info("Active todo count is: {}",todoItemList.size());
       return todoItemList;
    }
}
