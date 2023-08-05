package dto;

import com.india.nia.model.Officer;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class PayrollAcknowledgement {
	
	public String status;
	public Officer officer;
	public PayrollAcknowledgement(String status, Officer officer) {
		this.officer = officer;
		this.status= status;
		
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Officer getOfficer() {
		return officer;
	}
	public void setOfficer(Officer officer) {
		this.officer = officer;
	}
	
	

}
