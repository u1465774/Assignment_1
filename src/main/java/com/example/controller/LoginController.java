package com.example.controller;

import com.example.domain.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

import static javax.swing.text.StyleConstants.ModelAttribute;


/**
 * Created by Luke Hardman on 20/01/17.
 */
@Controller
public class LoginController {
    @Autowired
    protected UserService userService;

    // This will create a new login and add it to the database
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String createLogin(Model model, @Valid @ModelAttribute("user") User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("user", user);
            model.addAttribute("users", userService.findAll());
            model.addAttribute("type", "danger");
            model.addAttribute("message", "Please provide a title for the new login.");
            return "login";
        }

        userService.save(user);

        model.addAttribute("user", new User());
        model.addAttribute("users", userService.findAll());

        model.addAttribute("type", "success");
        model.addAttribute("message", "A new login has been created.");

        return "index";
    }

        @RequestMapping(value = "/login", method = RequestMethod.GET)
        public String login(Model model) {
            model.addAttribute("user", new User());
            model.addAttribute("users", userService.findAll());
            return "login";
        }

}