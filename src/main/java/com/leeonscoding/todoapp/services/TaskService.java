package com.leeonscoding.todoapp.services;

import com.leeonscoding.todoapp.dto.TaskDTO;
import com.leeonscoding.todoapp.model.Task;
import org.springframework.stereotype.Service;

@Service
public interface TaskService {
    void addTask(TaskDTO taskDTO, long userId);
    Task findTask(long taskId);

    void findTasks(int startNo, int size, String searchTerm);

    void removeTask(long taskId);

    void updateTask(Task task);
}
