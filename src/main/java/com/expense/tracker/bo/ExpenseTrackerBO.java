package com.expense.tracker.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.expense.tracker.models.AppUser;
import com.expense.tracker.models.Member;
import com.expense.tracker.repositories.AppUserRepository;
import com.expense.tracker.repositories.MemberRepository;

@Component
public class ExpenseTrackerBO {
	@Autowired
	private MemberRepository memberRepository;

	@Autowired
	private AppUserRepository userRepository;

	public List<Member> getAllMembers() {
		return memberRepository.findAll();
	}

	public List<AppUser> getAllUsers() {
		return userRepository.findAll();
	}

	public Member createMember(Member member) {
		return memberRepository.insert(member);
	}
}
