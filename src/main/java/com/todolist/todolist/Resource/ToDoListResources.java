package com.todolist.todolist.Resource;

import com.todolist.todolist.Entities.ToDoList;
import com.todolist.todolist.Service.ToDoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/todo")
public class ToDoListResources {

    @Autowired
    private ToDoListService service;

    @PostMapping(value = "/create")
    public ResponseEntity<ToDoList> create(@RequestBody ToDoList obj){
        obj = service.create(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }

    @GetMapping(value = "/tasks")
    public ResponseEntity<List<ToDoList>> findAll(){
        List<ToDoList> l = service.findAll();
        return ResponseEntity.ok().body(l);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ToDoList> findById(@PathVariable Long id){
        ToDoList obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<ToDoList> update(@PathVariable Long id, @RequestBody ToDoList obj){
        obj = service.update(id,obj);
        return ResponseEntity.ok().body(obj);
    }

}
