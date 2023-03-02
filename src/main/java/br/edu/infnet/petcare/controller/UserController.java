package br.edu.infnet.petcare.controller;

import br.edu.infnet.petcare.model.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @GetMapping("/user")
    public String registrationScreen() {
        return "user/register";
    }

    @PostMapping("/user")
    public String createUser(User user) {
        System.out.println(user);
        return "redirect:/";
    }

}
