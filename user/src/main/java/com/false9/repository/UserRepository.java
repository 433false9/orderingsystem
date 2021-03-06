package com.false9.repository;

import com.false9.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UserRepository {
    public List<User> findAll(int index, int limit);
    public int count();
    public void save(User user);
    public void deleteById(long id);
}
