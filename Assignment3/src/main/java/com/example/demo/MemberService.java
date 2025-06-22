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
public class MemberService {
	@Autowired
	private MemberRepository repository;

	public Flux<Member> getAll() {
		return repository.findAll().switchIfEmpty(Flux.empty());
	}

	public Mono<Member> getById(final String id) {
		return repository.findById(id);
	}

	public Mono<Member> update(final String id, final Member model) {
		return repository.save(model);
	}

	public Mono<Member> save(final Member employee) {
		return repository.save(employee);
	}

	public Mono<Member> delete(final String id) {
		final Mono<Member> dbRecord = getById(id);
		if (Objects.isNull(dbRecord)) {
			return Mono.empty();
		}

		return getById(id).switchIfEmpty(Mono.empty()).filter(Objects::nonNull).flatMap(
				employeeToBeDeleted -> repository.delete(employeeToBeDeleted).then(Mono.just(employeeToBeDeleted)));
	}
}