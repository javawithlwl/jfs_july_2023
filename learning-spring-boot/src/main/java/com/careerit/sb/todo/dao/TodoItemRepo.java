package com.careerit.sb.todo.dao;

import com.careerit.sb.todo.domain.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TodoItemRepo extends JpaRepository<TodoItem,Long> {

    @Query("select t from TodoItem t where t.deleted=false")
    List<TodoItem> findActiveTodos();
}
