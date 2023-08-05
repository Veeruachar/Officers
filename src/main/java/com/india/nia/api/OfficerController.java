package com.india.nia.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.india.nia.model.Officer;
import com.india.nia.service.OfficerService;

@RestController
public class OfficerController {
	
	@Autowired
	OfficerService officerService;
	@GetMapping("/officer")
	public List<Officer> getOfficer() {
		
		return officerService.getOfficerServiceImpl();
		
	}
	
	@GetMapping("/officer/{officerId}")
	public Officer getOfficerById(@PathVariable("officerId") int officerId) {

		return officerService.getOfficerByIdServiceImpl(officerId);
		
	}
	
	@PostMapping("/officer/add")
	@ResponseBody
	public Officer addOfficer( @RequestBody Officer officer) {
		
		return officerService.addOfficerServiceImpl(officer);
		
	}
	
	@PutMapping("/officer/update")
	@ResponseBody
	public Officer updateOfficer( @RequestBody Officer officer) {
		
		return officerService.updateOfficerServiceImpl(officer);
		
	}
	
	@DeleteMapping("/officer/delete/{officerId}")
	@ResponseBody
	public Officer deleteOfficerByIdOfficer( @PathVariable("officerId") int officerId) {
		
		return officerService.deleteOfficerByIdServiceImpl(officerId);
		
	}
	

}
