package com.edwise.springboot.openapispringboot.controller;

import com.edwise.springboot.openapispringboot.model.Pet;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/pets/")
@Slf4j
public class PetController {


    @GetMapping
    public ResponseEntity<List<Pet>> getAll() {
        List<Pet> pets = List.of(Pet.builder().id("11").name("pet1").type("type1").age(11).build(),
                                 Pet.builder().id("22").name("pet2").type("type2").age(12).build(),
                                 Pet.builder().id("33").name("pet3").type("type3").age(13).build());

        log.info("Pets found: {}", pets);
        return new ResponseEntity<>(pets, HttpStatus.OK);
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<Pet> getById(@PathVariable String id) {
        Pet pet = Pet.builder().id("11").name("pet1").type("type1").age(11).build();

        log.info("Pet found by id: {}", pet);
        return new ResponseEntity<>(pet, HttpStatus.OK);
    }
}
