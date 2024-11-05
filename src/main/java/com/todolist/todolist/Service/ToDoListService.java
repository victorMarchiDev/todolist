package com.todolist.todolist.Service;

import com.todolist.todolist.Entities.ToDoList;
import com.todolist.todolist.Repository.ToDoListRepository;
import com.todolist.todolist.Service.exceptions.ResourceNotFoundException;
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

    public ToDoList findById(Long id) {
        return toDoListRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Tarefa não encontrada com ID: " + id));
    }

    public void updateData(ToDoList entity, ToDoList obj){
        entity.setTitle(obj.getTitle());
        entity.setDescription(obj.getDescription());
        entity.setPriority(obj.getPriority());
    }

    public ToDoList update(Long id, ToDoList obj){
        ToDoList entity = toDoListRepository.getReferenceById(id);
        updateData(entity, obj);
        return toDoListRepository.save(entity);
    }
}
