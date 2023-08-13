package com.leeonscoding.todoapp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

@NoArgsConstructor
@Getter
@Setter
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

    @OneToOne
    @JoinColumn(name = "task_id", foreignKey = @ForeignKey(name = "fk_task_id"))
    Task task;
}
