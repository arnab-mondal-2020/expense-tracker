package com.expense.tracker.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.expense.tracker.models.Expense;
import com.expense.tracker.repositories.ExpenseRepository;

@RestController
public class ExpenseRestController {
	@Autowired
	private ExpenseRepository repository;

	@PostMapping(value = "/expense/add", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_PROBLEM_JSON_UTF8_VALUE)
	public Expense addExpense(@RequestBody Expense expense) {
		expense.setExpenseId("EXPN" + Long.toHexString(System.currentTimeMillis()));
		return repository.save(expense);
	}

	@GetMapping(value = "/expense/{id}", produces = MediaType.APPLICATION_PROBLEM_JSON_UTF8_VALUE)
	public Expense getExpense(@PathVariable("id") String id) {
		return repository.findById(id).get();
	}

	@GetMapping(value = "/expense/all", produces = MediaType.APPLICATION_PROBLEM_JSON_UTF8_VALUE)
	public List<Expense> getAllExpenses() {
		return repository.findAll();
	}
}
