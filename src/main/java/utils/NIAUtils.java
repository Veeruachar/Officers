package utils;

import java.util.HashMap;
import java.util.Map;

import com.india.nia.model.Officer;

import exception.NonTaxableException;
import lombok.Data;

@Data
public class NIAUtils {
	
	static Map<String,Integer> taxCriteria = new HashMap<>();
	
	static {
		taxCriteria.put("L1", 68000);
		taxCriteria.put("L2", 88000);
		taxCriteria.put("L3", 188000);

	}
	
	public static boolean isTaxable(Officer officer) throws NonTaxableException {
		
		if(officer.getSalary() < taxCriteria.get(officer.getGrade())) {
			throw new NonTaxableException("Not a taxable officer");
		}
		
		return true;
		
	}

}
