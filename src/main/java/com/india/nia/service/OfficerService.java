package com.india.nia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.india.nia.model.Officer;
import com.india.nia.repository.OfficersRepository;

@Service
public class OfficerService {
	
	@Autowired
	OfficersRepository officersRepository;
	
	public List<Officer> getOfficerServiceImpl() {
		
		return officersRepository.findAll();
		
	}

	public Officer addOfficerServiceImpl(Officer officer) {
		
		return officersRepository.save(officer);
	}

	public Officer updateOfficerServiceImpl(Officer officer) {
		
		Officer officer2 = officersRepository.findById(officer.getId()).orElse(null);
		officer2.setName("Bhagath singh");
		
		return officersRepository.save(officer2);

	}

	public Officer deleteOfficerByIdServiceImpl(int officerId) {
		
		Officer officer = officersRepository.findById(officerId).orElse(null);
		officersRepository.deleteById(officerId);
		return officer;
	}

	public Officer getOfficerByIdServiceImpl(int officerId) {
		return officersRepository.findById(officerId).orElse(null);
		 
	}
	
	
	

}
