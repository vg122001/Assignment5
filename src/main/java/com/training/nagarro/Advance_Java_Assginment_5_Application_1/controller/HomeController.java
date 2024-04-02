package com.training.nagarro.Advance_Java_Assginment_5_Application_1.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

import com.training.nagarro.Advance_Java_Assginment_5_Application_1.externalApi.GetAllBooks;
import com.training.nagarro.Advance_Java_Assginment_5_Application_1.model.Book;
import static com.training.nagarro.Advance_Java_Assginment_5_Application_1.constants.Constants.*;


@Controller
public class HomeController {
	
	@RequestMapping(value = homeUrl, method = {RequestMethod.POST, RequestMethod.GET})
	public String homePage(WebRequest request, Model model) {
		if (request.getAttribute("usr", WebRequest.SCOPE_SESSION) == null) {
			return redirectToLoginPage;
		}
		
		List<Book> bookList = GetAllBooks.callGetAllBooksAPI();

		
		model.addAttribute(booksList, bookList);
		
		
		return home;
	}


}
