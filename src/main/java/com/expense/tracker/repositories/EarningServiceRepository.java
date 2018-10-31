package com.expense.tracker.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.expense.tracker.models.Earning;

@Repository
public interface EarningServiceRepository extends MongoRepository<Earning, String> {

}
