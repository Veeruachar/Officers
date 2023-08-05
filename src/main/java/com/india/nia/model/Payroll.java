package com.india.nia.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Payroll")
public class Payroll {
	
	@Id
	int id; 
	int officerId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getOfficerId() {
		return officerId;
	}
	public void setOfficerId(int officerId) {
		this.officerId = officerId;
	}
}
