package com.grandcircus.controller;

import com.grandcircus.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")

    public ModelAndView helloWorld() {
        return new
                ModelAndView("welcome", "message", "Welcome to Bits & Bytes Coffee Shop");

    }


    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public ModelAndView user() {
        return new ModelAndView("registration", "command", new User());
    }

    @RequestMapping(value = "/customer", method = RequestMethod.POST)
    public String customer(User user, Model model) {
        model.addAttribute("name", user.getName());
        model.addAttribute("age", user.getAge());
        model.addAttribute("favoriteDrink", user.getFavoriteDrink());
        model.addAttribute("favoritePastry", user.getFavoritePastry());
        model.addAttribute("allergies", user.getAllergies());
        model.addAttribute("time", user.getTime());

        return "customer";

    }
}