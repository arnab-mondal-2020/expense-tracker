package com.expense.tracker.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.expense.tracker.models.Member;

@Repository
public interface MemberRepository extends MongoRepository<Member, String> {

}