package com.greenfox.listingtodos.controller;

import com.greenfox.listingtodos.repository.TodoRepository;
import com.greenfox.listingtodos.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
        return "todolist";
    }

}
