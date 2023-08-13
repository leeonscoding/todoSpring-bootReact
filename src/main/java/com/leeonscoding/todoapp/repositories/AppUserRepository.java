package com.leeonscoding.todoapp.repositories;

import com.leeonscoding.todoapp.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
}
