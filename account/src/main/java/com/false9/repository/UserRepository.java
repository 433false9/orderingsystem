package com.false9.repository;

import com.false9.entity.User;

public interface UserRepository {
    public User login(String username,String password);
}
