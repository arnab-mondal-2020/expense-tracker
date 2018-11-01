package com.expense.tracker.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.expense.tracker.bo.ExpenseTrackerBO;
import com.expense.tracker.bo.LoginUserBO;
import com.expense.tracker.models.AppUser;
import com.expense.tracker.models.Member;

@RestController
public class UserLoginRestController {
	@Autowired
	private LoginUserBO bo;
	@Autowired
	private ExpenseTrackerBO expenseBO;

	@PostMapping(value = "/login", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public AppUser login(@RequestBody AppUser user) {
		return bo.login(user);
	}

	@PostMapping(value = "/user/create", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public AppUser createUser(@RequestBody AppUser user) {
		return bo.createUser(user);
	}

	@PostMapping(value = "/member/create", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Member createMember(@RequestBody Member member) {
		return expenseBO.createMember(member);
	}

	@GetMapping(value = "/member/all", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Member> getAllMembers() {
		return expenseBO.getAllMembers();
	}

	@GetMapping(value = "/user/all", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<AppUser> getAllUsers() {
		return expenseBO.getAllUsers();
	}
}
