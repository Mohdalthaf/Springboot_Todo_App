package com.example.springboot.todo.application.repositories;

import com.example.springboot.todo.application.models.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface TodoItemRepository extends JpaRepository<TodoItem, Long> {
}
