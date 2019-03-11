package com.greenfox.listingtodos.service;

import com.greenfox.listingtodos.model.Todo;
import com.greenfox.listingtodos.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    private TodoRepository todoRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> getAllTodo() {
        List<Todo> todos = new ArrayList<>();

        todoRepository.findAll().forEach(todo -> todos.add(todo));

        return todos;
    }




}
