package web.spring.service;


import web.spring.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void saveUser(User user);

    User findById(long id);

    void updateUser(User user);

    void deleteUser(long id);
}
