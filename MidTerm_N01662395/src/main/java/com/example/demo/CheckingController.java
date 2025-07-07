package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequestMapping("/api/checking")
@AllArgsConstructor
@RestController
public class CheckingController {

    @Autowired
    private CheckingService service;

    // CREATE
    @PostMapping
    public Mono<Checking> save(@RequestBody final Checking checking) {
        return service.save(checking);
    }

    // READ ALL
    @GetMapping
    public Flux<Checking> getAll() {
        return service.getAll();
    }
}