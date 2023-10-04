package com.careerit.todoapp.service;

import com.careerit.todoapp.domain.Status;
import com.careerit.todoapp.domain.TodoItem;
import com.careerit.todoapp.dto.TodoItemDto;
import com.careerit.todoapp.repo.TodoItemRepo;
import com.careerit.todoapp.util.ConvertorUtil;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

@Service
@Slf4j
public class TodoItemServiceImpl implements TodoItemService{

    @Autowired
    private TodoItemRepo todoItemRepo;

    @Override
    public TodoItemDto addNewTodoItem(TodoItemDto todoItemDto) {
        Assert.notNull(todoItemDto,"TodoItemDto should not be null");
        Assert.notNull(todoItemDto.getTitle(),"Title should not be null");
        TodoItem todoItem = ConvertorUtil.convert(todoItemDto,TodoItem.class);
        todoItem = todoItemRepo.save(todoItem);
        todoItemDto = ConvertorUtil.convert(todoItem,TodoItemDto.class);
        log.info("Todo Item is saved with id :{}",todoItemDto.getId());
        return todoItemDto;
    }

    @Override
    public List<TodoItemDto> getAllTodoItems() {
        List<TodoItem> list = todoItemRepo.findAllWithStatus(Status.IN_PROGRESS);
        List<TodoItemDto> todoItemDtoList = ConvertorUtil.convert(list, new TypeReference<List<TodoItemDto>>() {});
        log.info("Total Todo items found :{}",todoItemDtoList.size());
        return todoItemDtoList;
    }

    @Override
    public TodoItemDto updateTodoItem(TodoItemDto todoItemDto) {
        return null;
    }

    @Override
    public boolean deleteTodoItem(long id) {
        return false;
    }

    @Override
    public TodoItemDto getTodoItemById(long id) {
        return null;
    }
}
