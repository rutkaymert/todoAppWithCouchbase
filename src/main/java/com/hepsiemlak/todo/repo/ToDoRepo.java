package com.hepsiemlak.todo.repo;

import com.hepsiemlak.todo.model.ToDoItem;


import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ToDoRepo extends CouchbaseRepository<ToDoItem,Long>{
    

}
