package com.leeonscoding.todoapp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
@Entity
public class Notification extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    private String title;
    private String description;
    private ZonedDateTime sentDateTime;

    @Enumerated(value = EnumType.STRING)
    private NotificationChannel channel;

    @Enumerated(value = EnumType.STRING)
    private NotificationStatus status;
}
