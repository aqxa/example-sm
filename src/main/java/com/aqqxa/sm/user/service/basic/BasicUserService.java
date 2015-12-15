package com.aqqxa.sm.user.service.basic;

import com.aqqxa.sm.user.condition.UserCondition;
import com.aqqxa.sm.user.entity.User;
import com.aqqxa.sm.user.repository.UserRepository;
import com.aqqxa.sm.user.service.UserService;

public class BasicUserService implements UserService {

    private UserRepository userRepository;

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void getUser(String username){
        UserCondition condition = new UserCondition();
        condition.setUsername(username);
        userRepository.queryOne(condition);
    }

    public boolean validatePassword(User user, String password){
        return user.getPassword().equals(password);
    }

}
