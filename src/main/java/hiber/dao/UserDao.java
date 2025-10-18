package hiber.dao;

import hiber.model.User;

import java.util.List;

public interface UserDao {
    void create(User user);
    User findById(Long id);
    User update(User user);
    void deleteById(long id);
    List<User> findAll();
}
