package com.leeonscoding.todoapp.services;

import com.leeonscoding.todoapp.dto.AddUserDTO;
import com.leeonscoding.todoapp.dto.GetUserDTO;
import com.leeonscoding.todoapp.model.AppUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AppUserService {
    void addUser(AddUserDTO userDTO);
    List<AppUser> getUsers(int pageNo, int size, String searchTerm);
    AppUser getUser(String searchTerm);
    GetUserDTO editUserInfo(AddUserDTO userDTO);

    void removeUser(long userId);
}
