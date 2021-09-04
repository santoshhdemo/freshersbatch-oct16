

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ZipValidator implements ConstraintValidator<IsZipValid, String>{
	
	
	
	@Override
	public void initialize(IsZipValid arg0) {
		
	}

	@Override
	public boolean isValid(String zip, ConstraintValidatorContext arg1) {
		if(zip.matches("654321|123456|879248|435416|987654|456789"))
			return true;
		return false;
	}
}
