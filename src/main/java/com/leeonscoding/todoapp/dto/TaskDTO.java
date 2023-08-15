package com.leeonscoding.todoapp.dto;

import com.leeonscoding.todoapp.model.ImportanceLevel;
import com.leeonscoding.todoapp.model.TaskStatus;

import java.time.ZonedDateTime;

public record TaskDTO(String title,
                      String description,
                      TaskStatus taskStatus,
                      ImportanceLevel importanceLevel,
                      ZonedDateTime startDateTime,
                      ZonedDateTime endDateTime) {
}
