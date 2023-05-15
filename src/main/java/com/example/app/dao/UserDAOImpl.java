package com.example.app.dao;

import com.example.app.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO{

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<User> getUsers() {
        return entityManager.createQuery("SELECT u FROM User u", User.class)
                .getResultList();
    }

    @Override
    public void deleteUserById(long id) {
        User userToDelete = entityManager.find(User.class, id);
        entityManager.remove(userToDelete);
    }

    @Override
    public void addUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void editUser(User user) {
        entityManager.merge(user);
    }

    @Override
    public User getUserById(long id) {
        return entityManager.find(User.class, id);
    }
}
