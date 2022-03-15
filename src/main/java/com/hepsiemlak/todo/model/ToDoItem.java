package com.hepsiemlak.todo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;


@Document
public class ToDoItem {

    @Id
    private Long id;
    private String title;
    private boolean done;


    public ToDoItem(){


    }
    
    public ToDoItem(Long id,String title,boolean done){
    
        this.id=id;
        this.title=title;
        this.done=done;
    
        
    }

    
    public Long getId(){

        return this.id;

    }

    public void setId(Long id){

        this.id=id;

    }

    public String getTitle(){

        return this.title;

    }

    public void setTitle(String title){

        this.title=title;

    }

    public boolean getDone(){

        return this.done;

    }

    public void setDone(boolean done){

        this.done=done;

    }




    
}




