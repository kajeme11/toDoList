package com.todolist.todoApp.controller;

import com.todolist.todoApp.modules.Task;
import com.todolist.todoApp.services.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }

    @GetMapping()
    public String getTasks(){
        List<Task> tasks = taskService.getAllTasks();

        return "";

    }
}
