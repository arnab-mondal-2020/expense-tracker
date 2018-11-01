package com.expense.tracker.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.expense.tracker.models.AppUser;

@Repository
public interface AppUserRepository extends MongoRepository<AppUser, String> {
	AppUser findByUsernameAndPassword(String username, String password);
}
