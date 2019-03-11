package com.greenfoxacademy.connectionwithmysql.controller;


import com.greenfoxacademy.connectionwithmysql.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value= "/todo", method = RequestMethod.GET)
public class TodoController {

    private TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;

    }

    @RequestMapping(value={"/", "list"},method = RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("todos", todoService.getAllTodo());
        return "todolist_table";
    }



}
