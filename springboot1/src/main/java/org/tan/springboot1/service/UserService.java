package org.tan.springboot1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tan.springboot1.entity.User;
import org.tan.springboot1.repository.UserRepo;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public List<User> findAll() {
        return userRepo.findAll();
    }

    public User searchById(Long id) {
        return userRepo.findById(id).get();
    }

    public User searchByUsername(String username) {
        return userRepo.getUserByName(username);
    }


    public User createUser(User user) {
        return userRepo.save(user);
    }

    public User updateUser(User user) {
        return userRepo.save(user);
    }

    public void deleteUserById(Long id) {
        userRepo.deleteById(id);
    }

}
