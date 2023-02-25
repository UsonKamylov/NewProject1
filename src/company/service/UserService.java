package company.service;

import company.model.User;

public interface UserService {
    void addUser(User user);

    User findById(int id);

    void deleteById(int id);

    void getAllUsers();

}
