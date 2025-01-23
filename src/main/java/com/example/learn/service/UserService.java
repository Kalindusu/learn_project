package com.example.learn.service;

import com.example.learn.repo.UserRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional

public class UserService {
    @Autowired
    private UserRepo userRepo;

}
