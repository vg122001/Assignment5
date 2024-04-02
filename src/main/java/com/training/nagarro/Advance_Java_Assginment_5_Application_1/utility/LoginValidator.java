package com.training.nagarro.Advance_Java_Assginment_5_Application_1.utility;

import com.training.nagarro.Advance_Java_Assginment_5_Application_1.model.Librarian;

import static com.training.nagarro.Advance_Java_Assginment_5_Application_1.constants.Constants.admin;
import static com.training.nagarro.Advance_Java_Assginment_5_Application_1.constants.Constants.password;

public class LoginValidator {

	public boolean validateUser(Librarian u) {
		boolean isValidUser = false;
        try {
        	
            Librarian libobj = new Librarian();
            libobj.setPassword(password);
            libobj.setUsername(admin);
        	
            
            if(libobj != null && libobj.getUsername().equals(u.getUsername()) && libobj.getPassword().equals(u.getPassword())) {
            	
                isValidUser = true;
            }
        } catch(Exception e) {
        	//e.printStackTrace();
            isValidUser = false;
                
        }
        return isValidUser;
	}
	
}
