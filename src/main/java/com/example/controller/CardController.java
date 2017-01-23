package com.example.controller;

import com.example.domain.Card;
import com.example.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by Luke Hardman on 15/12/16.
 */
@Controller
public class CardController {
    @Autowired
    protected CardService cardService;

    // checks if theres an error
    @RequestMapping(value = "/create/card", method = RequestMethod.POST)
    public String createCard(Model model, @Valid @ModelAttribute("card") Card card, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            //
            model.addAttribute("card", card);
            model.addAttribute("cards", cardService.findAll());
            model.addAttribute("type", "danger");
            model.addAttribute("message", "Please provide a title for the new card.");
            return "cards";
        }

        // adds the card to the database
        cardService.save(card);

        // returns the cards
        model.addAttribute("card", new Card());
        model.addAttribute("cards", cardService.findAll());

        model.addAttribute("type", "success");
        model.addAttribute("message", "A new card has been created.");

        return "cards";
    }
    // This will delete a card which is in the database called card
    @RequestMapping(value = "/delete/card/{card}", method = RequestMethod.GET)
    public String deleteCard(Model model, @PathVariable Card card){
        cardService.delete(card);

        model.addAttribute("card", new Card());
        model.addAttribute("cards", cardService.findAll());

        model.addAttribute("type", "success");
        model.addAttribute("message", "The card has been deleted.");

        return "cards";
    }

    @RequestMapping(value = "/card", method = RequestMethod.GET)
    public String card(Model model){
        model.addAttribute("card", new Card());
        model.addAttribute("cards", cardService.findAll());
        return "cards";
    }
}
