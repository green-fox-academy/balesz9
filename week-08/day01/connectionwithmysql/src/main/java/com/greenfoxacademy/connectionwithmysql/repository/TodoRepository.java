package com.greenfoxacademy.connectionwithmysql.repository;

import com.greenfoxacademy.connectionwithmysql.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}

  /*  Create a new interface which extends CrudRepository<Todo, Long>
Inject the new repository into the controller
        Put the classes into model, controller, repository packages
*/