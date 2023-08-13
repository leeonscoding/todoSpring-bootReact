package com.leeonscoding.todoapp.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class AppUser extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String phone;

    @Enumerated(value = EnumType.STRING)
    private Role role;
}
