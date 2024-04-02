package com.training.nagarro.Advance_Java_Assginment_5_Application_1.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;


import static com.training.nagarro.Advance_Java_Assginment_5_Application_1.constants.Constants.*;

@Controller
public class DeleteBookController {

    @RequestMapping(deleteBookUrl)
    public ModelAndView deleteById(@RequestParam String id){

        RestTemplate restTemplate = new RestTemplate();
        String url = app2ServerUrl+id;

        restTemplate.delete(url);

        ModelAndView modelAndView =new ModelAndView();

        modelAndView.setViewName(redirectToHomePage);

        return  modelAndView;
    }
}
