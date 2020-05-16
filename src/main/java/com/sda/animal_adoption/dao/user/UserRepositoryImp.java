package com.sda.animal_adoption.dao.user;

import com.sda.animal_adoption.dao.MyAnimalInterface;
import com.sda.animal_adoption.model.User;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRepositoryImp implements MyUserInterface {

    private UserRepository userRepository;

    @Autowired
    public UserRepositoryImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUser() {
        return userRepository.findById(1).orElse(new User());
    }

}
