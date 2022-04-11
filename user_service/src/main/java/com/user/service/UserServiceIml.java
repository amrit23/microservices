package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceIml implements UserService {
    List<User> list = Arrays.asList(
            new User(1311L, "Amrit Patel", "88887666"),
            new User(1312L, "Rupa Patel", "67676766"),
            new User(1314L, "Mohan Patel", "9999999")
    );
    @Override
    public User getUser(Long id) {
        //use lambda expression
        return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
