package com.uep.wap.service;

import com.uep.wap.dto.TaskDTO;
import com.uep.wap.model.Task;
import com.uep.wap.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class TasksService {
    @Autowired
    private TaskRepository taskRepository;

    public void addTask(TaskDTO taskDTO) {
        Task task = new Task();
        task.setTaskName(taskDTO.getTaskName());
        task.setAssignedUser(taskDTO.getAssignedUser());
        task.setEstimatedTime(taskDTO.getEstimatedTime());
        task.setProject(taskDTO.getProject());
        task.setExpirationDate(taskDTO.getExpirationDate());
        task.setKanbanBoard(taskDTO.getKanbanBoard());
        taskRepository.save(task);
        System.out.println("Task added!");
    }

    public Iterable<Task> getAllTasks() {
        return taskRepository.findAll();
    }
    //get create update
}
