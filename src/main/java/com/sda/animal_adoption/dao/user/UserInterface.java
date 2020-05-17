package com.sda.animal_adoption.dao.user;

import com.sda.animal_adoption.model.User;

import java.util.List;

public interface UserInterface {

    void save(User user);
    User findById(Integer id);
    List<User> findAll();
    void delete(Integer id);



}
