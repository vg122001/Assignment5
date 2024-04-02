package com.training.nagarro.Advance_Java_Assginment_5_Application_1.controller;

import java.util.Arrays;

import javax.validation.Valid;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.training.nagarro.Advance_Java_Assginment_5_Application_1.model.Librarian;
import com.training.nagarro.Advance_Java_Assginment_5_Application_1.utility.LoginValidator;

import static com.training.nagarro.Advance_Java_Assginment_5_Application_1.constants.Constants.*;

@Controller
@SessionAttributes("usr")
public class LoginController {
	
	    private LoginValidator validator = new LoginValidator();

		@RequestMapping(value = "/", method = RequestMethod.GET)
	    public String getLogin(Model model) {
	    	model.addAttribute(logged, new Librarian());
	    	
	        return "index";
	    }
	    
	    @RequestMapping(value = loginUrl, method = {RequestMethod.POST, RequestMethod.GET})
	    public String validateUsr(@ModelAttribute(logged) @Valid Librarian u, BindingResult result, Model model) {
	        
	        boolean isValid = this.validator.validateUser(u);
	 
	        if(isValid) {
	        	model.addAttribute(user, u.getUsername());

	            return redirectToHomePage;
	        } else {
	            
	            model.addAttribute(msg,wrongCredentials);

	            return index;
	        }
	 
	        
	    }
	    
	    


	}

