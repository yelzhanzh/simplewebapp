package net.formicary.simplewebapp.users.dao.impl;

///**
// * Created by Zhangariny on 12/05/2015.
// */

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import net.formicary.simplewebapp.users.dao.UserDao;
import net.formicary.simplewebapp.users.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

    //protected Class<User> entityClass;

    @PersistenceContext
    EntityManager entityManager;

    public void save(User user) {
        this.entityManager.persist(user);
    }

    public void update(User user) {
        this.entityManager.merge(user);
    }

    public void delete(Integer id) {
        User user = this.entityManager.find(User.class, id);
        this.entityManager.merge(user);
        this.entityManager.remove(user);
    }

    public User findId(Integer id) {
        return this.entityManager.find(User.class, id);
    }

    public List<User> findAll() {
        Query query = entityManager.createQuery("SELECT e from User e");
        return (List<User>) query.getResultList();

    }

}

