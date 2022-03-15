package com.hepsiemlak.todo.controller;

import java.util.List;


import com.hepsiemlak.todo.model.ToDoItem;
import com.hepsiemlak.todo.repo.ToDoRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/api")
public class ToDoController {
    
    @Autowired
    private ToDoRepo toDoRepo;



    @GetMapping("/find")
    public List<ToDoItem> findAll(){

        return toDoRepo.findAll();


    
    }

    @PostMapping("/save")
    public ToDoItem save(@Validated @RequestBody ToDoItem toDoItem){

        toDoRepo.save(toDoItem);

        return toDoItem;


    
    }
}


