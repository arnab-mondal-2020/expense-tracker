package com.expense.tracker.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.expense.tracker.models.Earning;
import com.expense.tracker.repositories.EarningServiceRepository;

@RestController
public class EarningRestController {
	@Autowired
	private EarningServiceRepository repository;

	@PostMapping(value = "/earning/add", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_PROBLEM_JSON_UTF8_VALUE)
	public Earning addEarning(@RequestBody Earning earning) {
		earning.setEarningId("EARN" + Long.toHexString(System.currentTimeMillis()));
		return repository.save(earning);
	}

	@GetMapping(value = "/earning/{id}", produces = MediaType.APPLICATION_PROBLEM_JSON_UTF8_VALUE)
	public Earning getEarning(@PathVariable("id") String id) {
		return repository.findById(id).get();
	}

	@GetMapping(value = "/earning/all", produces = MediaType.APPLICATION_PROBLEM_JSON_UTF8_VALUE)
	public List<Earning> getAllEarnings() {
		return repository.findAll();
	}
}
