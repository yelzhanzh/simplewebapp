package com.webapp;

import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;
import com.webapp.users.model.User;
import com.webapp.users.dao.UserDao;

import java.util.List;

/**
 * Created by Zhangariny on 11/05/2015.
 */

@Path("/users")
@Produces("application/json")
@Service
public class UserService {

    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;

    }

    @GET
    @Path("/")
    public Response showAll() {

//        User testUser1 = new User("Steven", "steven@asd.com", "01/02/1987","07648277526","London");
//        User testUser2 = new User("Jack", "jack@asd.com", "02/02/1997","07648277526","London");
//
//        getUserDao().save(testUser1);
//        getUserDao().save(testUser2);
        //List<User> users = MockUserTable.getAll();

        List<User> users = getUserDao().findAll();
        GenericEntity<List<User>> ge = new GenericEntity<List<User>>(users){};
        return Response.ok(ge).build();

    }

    @GET
    @Path("/{id}")
    public Response showId(@PathParam("id") Integer id) {

        User user = getUserDao().findId(id);
        GenericEntity<User> ge = new GenericEntity<User>(user){};
        return Response.ok(ge).build();
    }

    @POST
    @Path("/")
    public Response saveUser(User user) {

        getUserDao().save(user);
        return Response.ok("success").build();
    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public  Response deleteUser(@PathParam("id") Integer id) {

        getUserDao().delete(id);
        return Response.ok("success").build();
    }

    @PUT
    @Path("/{id}")
    public Response updateUser(User user) {

        getUserDao().update(user);
        return Response.ok("success").build();
    }





}
