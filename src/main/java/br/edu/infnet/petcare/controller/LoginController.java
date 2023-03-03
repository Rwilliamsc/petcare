package br.edu.infnet.petcare.controller;

import br.edu.infnet.petcare.model.domain.User;
import br.edu.infnet.petcare.model.repository.AuthRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {
    @GetMapping(value = "/login")
    public String loginScreen() {
        System.out.println("Teste de tela");
        return "login";
    }

    @PostMapping(value = "/login")
    public String login(@RequestParam String email, @RequestParam String password) {
        User user = new User(email, password);
        System.out.println(user);
        if (AuthRepository.auth(user)) {
            return "index";
        }
        return "login";
    }
}
