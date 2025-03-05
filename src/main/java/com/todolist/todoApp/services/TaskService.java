package com.todolist.todoApp.services;

import com.todolist.todoApp.modules.Task;
import com.todolist.todoApp.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;
    public List<Task> getAllTasks(){

        return taskRepository.findAll();
    }
}
