package com.india.nia.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.india.nia.model.Payroll;

@Repository
public interface PayrollRepository extends MongoRepository<Payroll, Integer> {

}
