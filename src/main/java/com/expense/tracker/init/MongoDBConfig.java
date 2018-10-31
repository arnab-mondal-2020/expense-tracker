package com.expense.tracker.init;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.expense.tracker.repositories.ExpenseRepository;

@Configuration
@EnableMongoRepositories(basePackageClasses = ExpenseRepository.class)
public class MongoDBConfig {

}
