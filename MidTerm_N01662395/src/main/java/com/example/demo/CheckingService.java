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
public class CheckingService {

    @Autowired
    private CheckingRepository repository;

    public Flux<Checking> getAll() {
        return repository.findAll().switchIfEmpty(Flux.empty());
    }

    public Mono<Checking> save(final Checking checking) {
        return repository.save(checking);
    }
}