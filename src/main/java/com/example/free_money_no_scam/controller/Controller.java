package com.example.free_money_no_scam.controller;

import com.example.free_money_no_scam.model.EmailFetch;
import com.example.free_money_no_scam.model.ValidateEmailService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @PostMapping(value = "/Succes")



    public String getEmail(WebRequest dataFraWeb) {
        String email = dataFraWeb.getParameter("email");
        ValidateEmailService validateEmailService = new ValidateEmailService();
        EmailFetch emailFetch = new EmailFetch();

        if (validateEmailService.isEmailValid(email)){
            System.out.println(dataFraWeb.getParameter("email"));
            emailFetch.emailFetcher(email);
            return "Succes";
        } else if (!validateEmailService.isEmailValid(email)){
            System.out.println("Invalid email");
            return "error";
        }
        return "redirect:/";
    }
    @GetMapping("Succes")
    public String succes(){return "Succes";}

    @GetMapping("error")
    public String error(){return error();}


}
