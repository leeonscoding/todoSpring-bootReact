package com.leeonscoding.todoapp.services;

import com.leeonscoding.todoapp.dto.AddUserDTO;
import com.leeonscoding.todoapp.dto.GetUserDTO;
import com.leeonscoding.todoapp.model.AppUser;
import com.leeonscoding.todoapp.repositories.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.List;

@Service
public class AppUserServiceImpl implements AppUserService {

    @Autowired
    private AppUserRepository userRepository;

    @Override
    public void addUser(AddUserDTO userDTO) {
        AppUser user = new AppUser();
        user.setName(userDTO.name());
        user.setEmail(userDTO.email());
        user.setPhone(userDTO.phone());
        user.setStatus(userDTO.status());
        user.setRole(userDTO.role());
        user.setCreatedDate(ZonedDateTime.now());
        user.setUpdatedDate(ZonedDateTime.now());

        userRepository.save(user);
    }

    @Override
    public List<AppUser> getUsers(int pageNo, int size, String searchTerm) {
        Sort userSort = Sort.sort(AppUser.class)
                                        .by(AppUser::getCreatedDate)
                                        .descending();
        Pageable page = PageRequest.of(pageNo, size, userSort);

        List<AppUser> users = userRepository.findAll(page).toList();

        return users;
    }

    @Override
    public AppUser getUser(String searchTerm) {
        return null;
    }

    @Override
    public GetUserDTO editUserInfo(AddUserDTO userDTO) {
        return null;
    }

    @Override
    public void removeUser(long userId) {
        userRepository.deleteById(userId);
    }
}
