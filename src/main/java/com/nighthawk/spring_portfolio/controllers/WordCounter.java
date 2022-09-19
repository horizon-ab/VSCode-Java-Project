package com.nighthawk.spring_portfolio.controllers;
/* MVC code that shows defining a simple Model, calling View, and this file serving as Controller
 * Web Content with Spring MVCSpring Example: https://spring.io/guides/gs/serving-web-con
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class WordCounter {

    // @GetMapping handles GET request for /greet, maps it to greeting() method
    @GetMapping("/wordCounter")
    // @RequestParam handles variables binding to frontend, defaults, etc
    public String counter(@RequestParam(name="text", required=false, defaultValue="") String text, Model model) {

        String[] splitText = text.split(" ");
        int words = splitText.length;

        // model attributes are visible to Thymeleaf when HTML is "pre-processed"
        model.addAttribute("words", words);

        // load HTML VIEW (greet.html)
        return "wordCounter"; 

    }

}