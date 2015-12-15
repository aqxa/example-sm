package com.aqqxa.sm.user.repository;

import com.aqqxa.sm.user.condition.UserCondition;
import com.aqqxa.sm.user.entity.User;

public interface UserRepository {

    User queryOne(UserCondition condition);

}
