package com.bowenberg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class BookController {
    @GetMapping
    public String getById(){
        System.out.println("项目you运行了一次");
        return "项目运行了一次";
    }
}
