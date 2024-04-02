package com.training.nagarro.Advance_Java_Assginment_5_Application_1.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import static com.training.nagarro.Advance_Java_Assginment_5_Application_1.constants.Constants.*;

@Controller
public class LogoutController {

    @RequestMapping(logoutUrl)
    public ModelAndView signingout(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName(index);
        return modelAndView;
    }
}
