package com.todolist.todolist.Service;

import com.todolist.todolist.Entities.ToDoList;
import com.todolist.todolist.Repository.ToDoListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class ToDoListService {

    @Autowired
    private ToDoListRepository toDoListRepository;

    public ToDoList create(ToDoList obj) {
        return toDoListRepository.save(obj);
    }

    public List<ToDoList> findAll(){
        return toDoListRepository.findAll();
    }

    public void delete(Long id) {
        toDoListRepository.deleteById(id);
    }

}
