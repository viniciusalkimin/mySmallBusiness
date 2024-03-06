package com.alkimin.mybusiness.core.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Scheduling {

    private UUID id;
    private Service service;
    private User costumer;
    private String description;
    private LocalDateTime init;

}
