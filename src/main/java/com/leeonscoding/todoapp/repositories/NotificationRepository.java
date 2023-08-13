package com.leeonscoding.todoapp.repositories;

import com.leeonscoding.todoapp.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
