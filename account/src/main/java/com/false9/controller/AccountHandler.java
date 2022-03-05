package com.false9.controller;

import com.false9.entity.Account;
import com.false9.repository.AdminRepository;
import com.false9.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountHandler {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AdminRepository adminRepository;

    @GetMapping("/login/{username}/{password}/{type}")
    public Account login(@PathVariable("username") String username,@PathVariable("password") String password,@PathVariable("type") String type){
        Account account = null;
        switch (type){
            case "user":
                account = userRepository.login(username, password);
                break;
            case "admin":
                account = adminRepository.login(username, password);
                break;
        }
        return account;
    }
}
