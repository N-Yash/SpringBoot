package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequestMapping("/api/savings")
@AllArgsConstructor
@RestController
public class SavingsController {

    @Autowired
    private SavingsService service;

    // CREATE
    @PostMapping
    public Mono<Savings> save(@RequestBody final Savings savings) {
        return service.save(savings);
    }

    // READ ALL
    @GetMapping
    public Flux<Savings> getAll() {
        return service.getAll();
    }
}