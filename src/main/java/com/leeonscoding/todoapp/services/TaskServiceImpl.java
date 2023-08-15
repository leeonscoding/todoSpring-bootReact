package com.leeonscoding.todoapp.services;

import com.leeonscoding.todoapp.dto.TaskDTO;
import com.leeonscoding.todoapp.model.AppUser;
import com.leeonscoding.todoapp.model.ImportanceLevel;
import com.leeonscoding.todoapp.model.Task;
import com.leeonscoding.todoapp.model.TaskStatus;
import com.leeonscoding.todoapp.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.ZonedDateTime;

public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private AppUserService appUserService;

    @Override
    public void addTask(TaskDTO taskDTO, long userId) {
        Task task = new Task();
        task.setTitle(taskDTO.title());
        task.setDescription(taskDTO.description());

        task.setStatus(taskDTO.taskStatus() == null ? TaskStatus.IN_PROGRESS : taskDTO.taskStatus());
        task.setLevel(taskDTO.importanceLevel() == null? ImportanceLevel.LOW : taskDTO.importanceLevel());

        task.setStartDateTime(taskDTO.startDateTime() == null ? ZonedDateTime.now() : taskDTO.startDateTime());
        task.setEndDateTime(taskDTO.endDateTime() == null? ZonedDateTime.now().plusDays(3) : taskDTO.endDateTime());

        AppUser user = appUserService.getUser("");
        task.setCreatedBy(user);
        task.setLastModifiedBy(user);

        taskRepository.save(task);
    }

    @Override
    public Task findTask(long taskId) {
        return taskRepository.findOneById(taskId);
    }

    @Override
    public void findTasks(int startNo, int size, String searchTerm) {

    }

    @Override
    public void removeTask(long taskId) {
        taskRepository.deleteById(taskId);
    }

    @Override
    public void updateTask(Task task) {

    }
}
