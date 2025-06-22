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
public class PublisherService {
	@Autowired
	private PublisherRepository repository;

	public Flux<Publisher> getAll() {
		return repository.findAll().switchIfEmpty(Flux.empty());
	}

	public Mono<Publisher> getById(final String id) {
		return repository.findById(id);
	}

	public Mono<Publisher> update(final String id, final Publisher model) {
		return repository.save(model);
	}

	public Mono<Publisher> save(final Publisher employee) {
		return repository.save(employee);
	}

	public Mono<Publisher> delete(final String id) {
		final Mono<Publisher> dbRecord = getById(id);
		if (Objects.isNull(dbRecord)) {
			return Mono.empty();
		}

		return getById(id).switchIfEmpty(Mono.empty()).filter(Objects::nonNull).flatMap(
				employeeToBeDeleted -> repository.delete(employeeToBeDeleted).then(Mono.just(employeeToBeDeleted)));
	}
}