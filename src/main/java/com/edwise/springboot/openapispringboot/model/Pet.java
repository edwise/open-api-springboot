package com.edwise.springboot.openapispringboot.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pet {

    private String id;
    private String name;
    private int age;
    private String type;
}
