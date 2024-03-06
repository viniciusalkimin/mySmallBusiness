package com.alkimin.mybusiness.infrastructure.service.impl;

import com.alkimin.mybusiness.application.service.UserService;
import com.alkimin.mybusiness.core.entity.User;
import com.alkimin.mybusiness.infrastructure.dto.RegisterUserData;
import com.alkimin.mybusiness.infrastructure.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    @Override
    public String create(RegisterUserData userData) {
        var user = User.builder().name(userData.name())
                .email(userData.email()).phone(userData.phone()).build();
        userRepository.save(user);
        return user.getId().toString();
    }
}
