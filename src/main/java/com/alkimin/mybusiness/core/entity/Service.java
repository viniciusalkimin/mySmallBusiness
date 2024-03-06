package com.alkimin.mybusiness.core.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Service {

    private UUID id;
    private Establishment establishment;
    private String name;
    private String description;
    private BigDecimal value;
    private Integer duration;
}
