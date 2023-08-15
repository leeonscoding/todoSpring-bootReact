package com.leeonscoding.todoapp.dto;

import com.leeonscoding.todoapp.model.Role;
import com.leeonscoding.todoapp.model.UserStatus;

public record GetUserDTO(long id,
                         String name,
                         String email,
                         String phone,
                         UserStatus status,
                         Role role) {
}
