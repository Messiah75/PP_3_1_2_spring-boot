package web.spring.dao;


import web.spring.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(long id);

    User findById(long id);
}
