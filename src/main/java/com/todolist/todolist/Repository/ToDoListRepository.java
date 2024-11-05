package com.todolist.todolist.Repository;

import com.todolist.todolist.Entities.ToDoList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoListRepository extends JpaRepository<ToDoList, Long> {
}
