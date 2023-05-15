package com.example.app.service;


import com.example.app.entity.User;

import java.util.List;

public interface UserService {

    List<User> getUsers();

    void deleteUserById(long id);

    void addUser(User user);

    void editUser(User user);
    User getUserById(long id);
}
