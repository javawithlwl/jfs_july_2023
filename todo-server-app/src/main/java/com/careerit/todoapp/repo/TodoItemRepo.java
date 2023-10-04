package com.careerit.todoapp.repo;

import com.careerit.todoapp.domain.Status;
import com.careerit.todoapp.domain.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TodoItemRepo extends JpaRepository<TodoItem, Long> {

        @Query("select t from TodoItem t where t.status =:status")
        List<TodoItem> findAllWithStatus(@Param("status") Status status);
}
