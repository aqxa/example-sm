package com.aqqxa.sm.user.entity;

import com.aqqxa.sm.basic.entity.VersionedEntity;

public class User extends VersionedEntity{

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
