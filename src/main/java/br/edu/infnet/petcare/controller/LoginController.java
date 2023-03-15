package br.edu.infnet.petcare.controller;

import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import br.edu.infnet.petcare.model.domain.User;
import br.edu.infnet.petcare.model.repository.AuthRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@SessionAttributes("sessionUser")
public class LoginController {
    @GetMapping(value = "/login")
    public String loginScreen() {
        System.out.println("Teste de tela");
        return "login";
    }

    @PostMapping(value = "/login")
    public String login(Model model, @RequestParam String email, @RequestParam String password) {
        User user = new User(email, password);
        User userAuth = AuthRepository.auth(user);
       

        if (userAuth != null) {
            model.addAttribute("sessionUser", userAuth);
            return "redirect:home";
        }
        return "login";
    }

    @GetMapping(value = "/logout")
    public String logout(HttpSession session, SessionStatus status) {
        status.setComplete();

        session.removeAttribute("sessionUser");

        return "redirect:/";
    }
}
