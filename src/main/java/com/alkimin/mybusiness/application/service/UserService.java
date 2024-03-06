package com.alkimin.mybusiness.application.service;

import com.alkimin.mybusiness.infrastructure.dto.RegisterUserData;

public interface UserService {
    String create(RegisterUserData userData);
}
