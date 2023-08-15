package com.leeonscoding.todoapp.dto;

import com.leeonscoding.todoapp.model.Role;
import com.leeonscoding.todoapp.model.UserStatus;

public record AddUserDTO(String name,
                         String email,
                         String phone,
                         UserStatus status,
                         Role role) {
}
