package com.careerit.todoapp.controller;

import com.careerit.todoapp.dto.TodoItemDto;
import com.careerit.todoapp.service.TodoItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class TodoItemController {

        @Autowired
        private TodoItemService todoItemService;

        @PostMapping("/add")
        public ResponseEntity<TodoItemDto> addNewTodoItem(@RequestBody TodoItemDto todoItemDto){
            return ResponseEntity.ok(todoItemService.addNewTodoItem(todoItemDto));
        }

        @GetMapping("/all")
        public ResponseEntity<List<TodoItemDto>> getAllTodoItems(){
            List<TodoItemDto> itemList = todoItemService.getAllTodoItems();
            return ResponseEntity.ok(itemList);
        }
}
