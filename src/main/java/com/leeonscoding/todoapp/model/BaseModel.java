package com.leeonscoding.todoapp.model;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.ZonedDateTime;

@Getter
@Setter
@MappedSuperclass
public class BaseModel {
    @CreatedDate
    private ZonedDateTime createdDate;
    @LastModifiedDate
    private ZonedDateTime updatedDate;
}
