package com.polarbookshop.catalogservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String getGretting(){
        return "Welcome to the book catalog!";
    }


}
