package com.false9.repository;

import com.false9.entity.Admin;

public interface AdminRepository {
    public Admin login(String username,String password);
}
