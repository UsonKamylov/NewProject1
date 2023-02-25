package company.service.impl;

import company.model.MyException;
import company.model.User;
import company.dao.UserDao;
import company.service.UserService;

public class UserServiceImpl implements UserService {

    UserDao userDao = new UserDao();

    public UserServiceImpl() {
    }

    @Override
    public void addUser(User user) {
        userDao.getUsers().add(user);
    }

    @Override
    public User findById(int id) {
        for (User user : userDao.getUsers()) {
            if (user.getId() == id) {
                return user;
            }
        }
        throw new MyException("Have not user with id " + id);
    }


    @Override
    public void deleteById(int id) {
        for (int i = 0; i <userDao.getUsers().size(); i++) {
            for (User use : userDao.getUsers()) {
                if (id == use.getId()) {
                    userDao.getUsers().remove(userDao.getUsers().get(i));
                    System.out.println(use);
                }
            }
        }
        throw new MyException("myndai id mn user jook " + id);
    }

    @Override
    public void getAllUsers() {
        for (User u : userDao.getUsers()) {
            System.out.println(u);

        }

    }
}
