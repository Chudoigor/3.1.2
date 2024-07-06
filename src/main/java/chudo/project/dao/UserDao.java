package chudo.project.dao;


import chudo.project.model.User;

import java.util.List;

public interface UserDao {

    void add(User user);
    void remove(User user);
    List<User> findAll();
    User findById(Long id);
}
