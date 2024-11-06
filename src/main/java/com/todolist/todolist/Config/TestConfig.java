package com.todolist.todolist.Config;

import com.todolist.todolist.Entities.ToDoList;
import com.todolist.todolist.Repository.ToDoListRepository;
import com.todolist.todolist.Resource.ToDoListResources;
import com.todolist.todolist.Service.ToDoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private ToDoListService service;
    @Autowired
    private ToDoListRepository repository;
    @Autowired
    private ToDoListResources resource;

    @Override
    public void run(String... args) throws Exception {

    }
}
