package com.greenfoxacademy.connectwithsql.repository;

import com.greenfoxacademy.connectwithsql.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}
