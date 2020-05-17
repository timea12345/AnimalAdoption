package com.sda.animal_adoption.service;

import com.sda.animal_adoption.dao.user.UserDaoFake;
import com.sda.animal_adoption.dao.user.UserInterface;
import com.sda.animal_adoption.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

//    private UserDaoFake userDaoFake = new UserDaoFake();

    // private UserRepository userRepository;

    private UserInterface userInterface;

    @Autowired
    public UserService(@Qualifier("userRepositoryImp") UserInterface userInterface) {
        this.userInterface = userInterface;
    }

    public List<User> findAll() {
        return userInterface.findAll();
    }

    public void saveU(User user) {
        userInterface.save(user);
    }

    public List<User> findAllWithGivenInitial(String initial) {
        List<User> users = userInterface.findAll();
        List<User> usersResult = new ArrayList<>();
        for (User user : users) {
            if (user.getName().startsWith(initial)) {
                usersResult.add(user);
            }
        }
        return usersResult;
    }

    public User findById(Integer id) {
        return userInterface.findById(id);
    }

    public void delete(Integer id) {
        userInterface.delete(id);
    }


}
