package com.training.nagarro.Advance_Java_Assginment_5_Application_1.controller;



import com.training.nagarro.Advance_Java_Assginment_5_Application_1.externalApi.GetAllAuthors;
import com.training.nagarro.Advance_Java_Assginment_5_Application_1.externalApi.UpdateBookApi;

import com.training.nagarro.Advance_Java_Assginment_5_Application_1.model.Author;
import com.training.nagarro.Advance_Java_Assginment_5_Application_1.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;
import  static com.training.nagarro.Advance_Java_Assginment_5_Application_1.constants.Constants.*;

@Controller
public class EditBookController {



    @RequestMapping(editlUrl)
    public ModelAndView viewEditPage(@RequestParam String id){

        RestTemplate restTemplate = new RestTemplate();
        String url = app2ServerUrl+id;
        Book bookObject = restTemplate.getForObject(url,Book.class);
        ModelAndView modelAndView = new ModelAndView();
        System.out.println(bookObject.getBookName());
        List<Author> authors = GetAllAuthors.callGetAllAuthorsAPI();
        modelAndView.addObject(book,bookObject);
        modelAndView.addObject(authorsList,authors);
        modelAndView.setViewName(editBookJsp);
        return modelAndView;
    }


    @RequestMapping(value = updateUrl,method = RequestMethod.POST)
    public String editBook(@ModelAttribute(book) @Valid Book b, BindingResult result, WebRequest request, Model model) {
        if(request.getAttribute(user, WebRequest.SCOPE_SESSION) == null) {
            return redirectToLoginPage;
        }

        UpdateBookApi.callUpdateBookAPI(b);
        return redirectToHomePage;

    }
}
