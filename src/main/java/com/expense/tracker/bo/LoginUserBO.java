package com.expense.tracker.bo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.expense.tracker.models.AppUser;
import com.expense.tracker.models.Member;
import com.expense.tracker.repositories.AppUserRepository;
import com.expense.tracker.repositories.MemberRepository;

@Component
public class LoginUserBO {
	@Autowired
	private AppUserRepository repository;

	@Autowired
	private MemberRepository memberRepository;

	public AppUser login(AppUser user) {
		return repository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
	}

	public AppUser createUser(AppUser user) {
		user.setCreatedOn(toCurrentDate());
		AppUser createdUser = repository.insert(user);
		Member member = toMember(createdUser);
		member = memberRepository.insert(member);
		createdUser.setMemberId(member.getMemberId());
		repository.save(createdUser);
		return createdUser;
	}

	private Member toMember(AppUser user) {
		Member m = new Member();

		m.setFullName(user.getFullName());
		m.setNickName(user.getNickName());
		m.setAppUserId(user.getUserId());
		m.setContactNumber(user.getContactNumber());
		return m;
	}

	private String toCurrentDate() {
		return new SimpleDateFormat("dd-MMM-yyyy 'at' HH:mm:ss").format(new Date());
	}

}
