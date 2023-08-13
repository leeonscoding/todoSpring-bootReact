package com.leeonscoding.todoapp.repositories;

import com.leeonscoding.todoapp.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
