package br.edu.infnet.petcare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.petcare.model.domain.User;

@Controller
public class AppController {

    @GetMapping(value = "/")
    public String initScreen() {
        return "index";
    }

    @GetMapping(value = "/home")
    public String homeScreen(@SessionAttribute("sessionUser") User user) {
        if (user != null) {
            return "home/home";
        }
        return "redirect:/";
    }
}