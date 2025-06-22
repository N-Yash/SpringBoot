package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequestMapping("/members")
@AllArgsConstructor
@RestController
public class MemberController {
	@Autowired
	private MemberService service;

	@GetMapping
	public Flux<Member> getAll() {
		return service.getAll();

	}

	@GetMapping("{id}")
	public Mono<Member> getById(@PathVariable("id") final String id) {
		return service.getById(id);
	}

	@PutMapping("{id}")
	public Mono<Member> updateById(@PathVariable("id") final String id,
			@RequestBody final Member employee) {
		return service.update(id, employee);
	}

	@PostMapping
	public Mono<Member> save(@RequestBody final Member model) {
		return service.save(model);

	}

	@DeleteMapping("{id}")
	public Mono<Member> delete(@PathVariable final String id) {
		return service.delete(id);
	}
}