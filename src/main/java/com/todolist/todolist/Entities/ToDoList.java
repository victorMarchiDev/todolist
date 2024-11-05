package com.todolist.todolist.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.Serializable;
import java.util.Objects;

@Entity
public class ToDoList implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String priority;

    public ToDoList(){
    }

    public ToDoList(Long id, String title, String description, String priority) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.priority = priority;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ToDoList toDoList = (ToDoList) o;
        return Objects.equals(id, toDoList.id) && Objects.equals(title, toDoList.title) && Objects.equals(description, toDoList.description) && Objects.equals(priority, toDoList.priority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, priority);
    }
}
