package br.edu.infnet.petcare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping(value = "/")
    public String initScreen() {
        return "redirect:/login";
    }
    @GetMapping(value = "/home")
    public String homeScreen() {
        return "index";
    }
}