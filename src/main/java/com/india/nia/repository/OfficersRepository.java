package com.india.nia.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.india.nia.model.Officer;

@Repository
public interface OfficersRepository extends MongoRepository<Officer,Integer>{
	

}
