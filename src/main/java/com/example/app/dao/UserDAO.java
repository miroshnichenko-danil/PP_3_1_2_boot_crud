package com.example.app.dao;



import com.example.app.entity.User;

import java.util.List;

public interface UserDAO {

    List<User> getUsers();

    void deleteUserById(long id);

    void addUser(User user);

    void editUser(User user);


    User getUserById(long id);
}
