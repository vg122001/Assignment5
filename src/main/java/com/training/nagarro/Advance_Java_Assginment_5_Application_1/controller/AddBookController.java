package com.training.nagarro.Advance_Java_Assginment_5_Application_1.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import com.training.nagarro.Advance_Java_Assginment_5_Application_1.externalApi.GetAllAuthors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import com.training.nagarro.Advance_Java_Assginment_5_Application_1.externalApi.AddBook;
/*import com.training.nagarro.Advance_Java_Assginment_5_Application_1.externalApi.EditBook;
import com.training.nagarro.Advance_Java_Assginment_5_Application_1.externalApi.GetAllAuthors;*/
import com.training.nagarro.Advance_Java_Assginment_5_Application_1.externalApi.GetAllBooks;
import com.training.nagarro.Advance_Java_Assginment_5_Application_1.model.Author;
import com.training.nagarro.Advance_Java_Assginment_5_Application_1.model.Book;
import com.training.nagarro.Advance_Java_Assginment_5_Application_1.model.Librarian;

import static com.training.nagarro.Advance_Java_Assginment_5_Application_1.constants.Constants.*;


@Controller
public class AddBookController {

	@RequestMapping(value = addUrl, method = RequestMethod.POST)
	public String add(Model model, WebRequest request) {
		
		if (request.getAttribute(user, WebRequest.SCOPE_SESSION) == null) {
			return redirectToLoginPage;
		}
		
		List<Author> authors = GetAllAuthors.callGetAllAuthorsAPI();
		authors.forEach(s-> System.out.println(s.getName()));
		
		model.addAttribute(authorsList, authors);
		return addBookJsp;

	}

	@RequestMapping(value=addBookUrl, method={RequestMethod.POST})
	public String addBook(@ModelAttribute(abook) @Valid Book b, BindingResult result,WebRequest request, Model model) {
		if(request.getAttribute(user, WebRequest.SCOPE_SESSION) == null) {
			return redirectToLoginPage;
		}
		AddBook.callCreateBookAPI(b);
			return redirectToHomePage;
		
	}
	
	@RequestMapping(value=cancelUrl, method={RequestMethod.POST})
	public String cancel(WebRequest request) {
		
		if(request.getAttribute(user, WebRequest.SCOPE_SESSION) == null) {
			return redirectToLoginPage;
		}
	    return redirectToHomePage;
	}
}
