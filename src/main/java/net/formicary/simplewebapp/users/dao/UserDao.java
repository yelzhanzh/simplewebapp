package net.formicary.simplewebapp.users.dao;

import net.formicary.simplewebapp.users.model.User;

import java.util.Collection;

/**
 * Created by Zhangariny on 12/05/2015.
 */

public interface UserDao {

    void save(User user);

    void update(User user);

    void delete(Integer id);

    User findId(Integer id);

    Collection<User> findAll();

}
