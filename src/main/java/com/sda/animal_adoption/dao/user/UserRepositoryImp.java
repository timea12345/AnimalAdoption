package com.sda.animal_adoption.dao.user;

import com.sda.animal_adoption.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class UserRepositoryImp implements UserInterface {

    private UserRepository userRepository;

    @Autowired
    public UserRepositoryImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUser() {
        return userRepository.findById(1).orElse(new User());
    }


    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public User findById(Integer id) {
        return userRepository.findById(id).orElseThrow(() -> new NullPointerException("User not found!"));
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        userRepository.delete(findById(id));
    }

    @Override
    public void update(Integer id, User newUser) {
        userRepository.findById(id).orElseThrow(
                () -> new NullPointerException("User not found"))
                .setName(newUser.getName());
        userRepository.findById(id).orElseThrow(
                () -> new NullPointerException("User not found"))
                .setEmail(newUser.getEmail());
        userRepository.findById(id).orElseThrow(
                () -> new NullPointerException("User not found"))
                .setPhone(newUser.getPhone());
        userRepository.findById(id).orElseThrow(
                () -> new NullPointerException("User not found"))
                .setAddress(newUser.getAddress());
    }
}
