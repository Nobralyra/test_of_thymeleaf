package com.test.test_of_thymeleaf.controller;

import com.test.test_of_thymeleaf.model.AR225;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class HomeController
{

    //starting page for index validation
    @RequestMapping (value = "/index", method = RequestMethod.GET)
    public String index(Model model)
    {
        //instantiate an AR225 blanket object
        AR225 ar225 = new AR225();

        //add it to the model
        model.addAttribute("ar225", ar225);

        //get out
        return "index";
    }

    @RequestMapping (value = "/index", method = RequestMethod.POST)
    public String indexSubmit(@Valid AR225 ar225, BindingResult bindingResult, Model model)
    {
        //check for errors
        if(bindingResult.hasErrors())
        {
            return "index";
        }

        //if there are no errors, show index success screen
        return "indexSuccess";
    }



}
