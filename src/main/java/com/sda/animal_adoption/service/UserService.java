package com.sda.animal_adoption.service;

import com.sda.animal_adoption.dao.user.UserDao;
import com.sda.animal_adoption.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

//    private UserDaoFake userDaoFake = new UserDaoFake();

    // private UserRepository userRepository;

    private UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public List<User> findAll() {
        return userDao.findAll();
    }

    public void saveU(User user) {
        userDao.save(user);
    }

    public List<User> findAllWithGivenInitial(String initial) {
        List<User> users = userDao.findAll();
        List<User> usersResult = new ArrayList<>();
        for (User user : users) {
            if (user.getName().startsWith(initial)) {
                usersResult.add(user);
            }
        }
        return usersResult;
    }

    public void delete(Integer id) {
        userDao.delete(id);
    }


}
