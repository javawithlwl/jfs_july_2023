package com.careerit.sb.todo.controller;

import com.careerit.sb.todo.domain.TodoItem;
import com.careerit.sb.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/todo")
public class TodoItemController {

    @Autowired
    private TodoService todoService;

    @PostMapping
    public ResponseEntity<TodoItem> create(@RequestBody TodoItem todoItem) {
        return ResponseEntity.ok(todoService.addTodoItem(todoItem));
    }

    @GetMapping("/all")
    public ResponseEntity<List<TodoItem>> getActiveTodos() {
        return ResponseEntity.ok(todoService.getTodos());
    }

    @GetMapping("/greet")
    public ResponseEntity<String> greet() {
        return ResponseEntity.ok("Greetings from User TodoController");
    }

    @GetMapping("/page-list")
    public ResponseEntity<Page<TodoItem>> getTotoItems(){
        return null;
    }
}
