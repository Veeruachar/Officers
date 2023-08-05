package com.india.nia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.india.nia.model.Officer;
import com.india.nia.model.Payroll;
import com.india.nia.repository.OfficersRepository;
import com.india.nia.repository.PayrollRepository;

import dto.PayrollAcknowledgement;
import dto.PayrollRequest;
import exception.NonTaxableException;
import utils.NIAUtils;

@Service
public class PayrollManagementService {
	
	@Autowired
	OfficersRepository officersRepository;
	
	@Autowired
	PayrollRepository payrollRepository;
	
	
	public PayrollAcknowledgement payrollmanagement(PayrollRequest request) throws NonTaxableException {
		
		Officer officer = request.getOfficer();
		officersRepository.save(officer);
		
		NIAUtils.isTaxable(officer);
		
		Payroll payroll = request.getPayroll();
		payrollRepository.save(payroll);
		
		return new PayrollAcknowledgement("SUCCESS",officer);
		
	}

}
