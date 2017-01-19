package com.example.controller;

import com.example.domain.Card;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
<<<<<<< HEAD
 * Created by Luke Hardman on 24/11/16.
=======
 * Created by Louie Qin on 24/11/16.
>>>>>>> 9fa015fd5af7fd4ac8079492f2d825755a0a5801
 */
@Controller
public class DemoController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/json", method = RequestMethod.GET)
    @ResponseBody
    public Card json(){
        Card card = new Card();
        card.setTitle("JSON example");
        return card;
    }
}
