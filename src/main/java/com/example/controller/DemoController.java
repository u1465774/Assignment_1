package com.example.controller;

import com.example.domain.Card;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Luke Hardman on 24/11/16.
 */
@Controller
public class DemoController {

    // Sends user to the index page when basic localhost is used without anything else
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    // Sends user to the /json page is its used in the searchbar
    @RequestMapping(value = "/json", method = RequestMethod.GET)
    @ResponseBody
    public Card json(){
        Card card = new Card();
        card.setTitle("JSON example");
        return card;
    }
}
