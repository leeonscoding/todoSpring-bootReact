package com.leeonscoding.todoapp.model;

import jakarta.persistence.MappedSuperclass;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.ZonedDateTime;

@MappedSuperclass
public class BaseModel {
    @CreatedDate
    private ZonedDateTime createdDate;
    @LastModifiedDate
    private ZonedDateTime updatedDate;
}
