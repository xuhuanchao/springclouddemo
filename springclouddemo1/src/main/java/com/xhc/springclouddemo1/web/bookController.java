package com.xhc.springclouddemo1.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bookController {

    @Value("${book.name}")
    private String bookName;

    @Value("${book.author}")
    private String author;

    @Value("${book.cost}")
    private float cost;

    @RequestMapping(value = "/book")
    public String book (){
        return String.format("book name is %s, author is %s, cost is %f", bookName, author, cost);
    }

}
