package com.webapp.users.dao;

import com.webapp.users.model.User;

import java.util.List;

/**
 * Created by Zhangariny on 12/05/2015.
 */

public interface UserDao {

    void save(User user);

    void update(User user);

    void delete(Integer id);

    User findId(Integer id);

    List<User> findAll();

}
