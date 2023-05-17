package com.uep.wap.dto;

import java.util.List;

public class TasksDataDTO {
    List<TaskDTO> tasks;

    public List<TaskDTO> getTasks() {
        return tasks;
    }

    public void setTasks(List<TaskDTO> tasks) {
        this.tasks = tasks;
    }
}
