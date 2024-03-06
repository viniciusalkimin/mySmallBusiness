package com.alkimin.mybusiness.infrastructure.dto;

import com.alkimin.mybusiness.core.entity.Service;
import com.alkimin.mybusiness.core.entity.User;

import java.time.LocalDateTime;

public record SchedulingData(User costumer, Service service, LocalDateTime time, String description) {
}
