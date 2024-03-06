package com.alkimin.mybusiness.core.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Establishment {
    private UUID id;
    private String name;
    private String description;
    private Category category;
    private OpeningHours openingHours;

}
