package com.example.demo;

import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Transactional
@AllArgsConstructor
public class BookService {

	@Autowired
	private BookRepository repository;

	public Flux<Book> getAll() {
		return repository.findAll().switchIfEmpty(Flux.empty());
	}

	public Mono<Book> getById(final String id) {
		return repository.findById(id);
	}

	public Mono<Book> update(final String id, final Book model) {
		return repository.save(model);
	}

	public Mono<Book> save(final Book employee) {
		return repository.save(employee);
	}

	public Mono<Book> delete(final String id) {
		final Mono<Book> dbRecord = getById(id);
		if (Objects.isNull(dbRecord)) {
			return Mono.empty();
		}

		return getById(id).switchIfEmpty(Mono.empty()).filter(Objects::nonNull).flatMap(
				employeeToBeDeleted -> repository.delete(employeeToBeDeleted).then(Mono.just(employeeToBeDeleted)));
	}

}