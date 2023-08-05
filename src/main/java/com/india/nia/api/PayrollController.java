package com.india.nia.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.india.nia.service.PayrollManagementService;

import dto.PayrollAcknowledgement;
import dto.PayrollRequest;
import exception.NonTaxableException;

@RestController
public class PayrollController {
	
	@Autowired
	PayrollManagementService payrollManagementService;
	@PostMapping("/transaction/payroll")
	@ResponseBody
	public PayrollAcknowledgement registerPayroll(@RequestBody PayrollRequest request) throws NonTaxableException {
		
		return payrollManagementService.payrollmanagement(request);	
	
	}
}
