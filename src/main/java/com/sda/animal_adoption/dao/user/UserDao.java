package com.sda.animal_adoption.dao.user;

import com.sda.animal_adoption.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDao {

    List<User> users = new ArrayList<>();

//    {
//        User user = new User();
//        user.setId(8);
//        user.setName("Timea");
//
//        User user1 = new User();
//        user1.setId(9);
//        user1.setName("Alex");
//
//        User user2 = new User();
//        user2.setId(100);
//        user2.setName("Ana");
//
//        users.add(user);
//        users.add(user1);
//        users.add(user2);
//    }

    public void save(User user) {
        users.add(user);
    }

    public void delete(Integer id) {
        int index = -1;

        for (int i = 0; i<users.size(); i++) {
            if (users.get(i).getId() != null && users.get(i).getId().equals(id)) {
                index = i;
                break;
            }
        }
        System.out.println(index);
        if (index != -1) {
            users.remove(index);
            System.out.println(users);
        }
    }

    public void updateEmail(Integer id, String email) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                user.setEmail(email);
            }
        }
    }

    public List<User> findAll() {
        return this.users;
    }

    public User findUser(Integer id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        throw new NullPointerException("User id not found!");
    }

}
