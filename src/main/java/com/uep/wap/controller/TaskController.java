package com.uep.wap.controller;

import com.uep.wap.dto.TaskDTO;
import com.uep.wap.dto.TasksDataDTO;
import com.uep.wap.model.Task;
import com.uep.wap.service.TasksService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class TaskController {

    private final TasksService tasksService;

    public TaskController(TasksService tasksService) {
        this.tasksService = tasksService;
    }

    @GetMapping(path = "/hello")
    public String sayHello(){
        return "Hello!";
    }

    @GetMapping(path = "/tasks")
    public Iterable<Task> getAllTasks(){
        return tasksService.getAllTasks();
    }

    @PostMapping(path = "/tasks")
    public String addTasks(@RequestBody TaskDTO taskDTO){
        tasksService.addTask(taskDTO);
        return "Tasks added!";
    }
}
