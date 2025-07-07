package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Transactional
@AllArgsConstructor
public class SavingsService {

    @Autowired
    private SavingsRepository repository;

    public Flux<Savings> getAll() {
        return repository.findAll().switchIfEmpty(Flux.empty());
    }

    public Mono<Savings> save(final Savings savings) {
        return repository.save(savings);
    }
}