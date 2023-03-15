package br.edu.infnet.petcare.controller;

import br.edu.infnet.petcare.model.domain.User;
import br.edu.infnet.petcare.model.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping("/user")
    public String listScreen(Model model) {
        model.addAttribute("users", UserRepository.list());
        return "user/list";
    }

    @GetMapping("/user/register")
    public String createScreen() {
        return "user/register";
    }

    @PostMapping("/user")
    public String create(User user) {
        if (UserRepository.create(user)){
            return "redirect:/login";
        }
        return "user/register";
    }

    @GetMapping(value = "/user/{id}/edit")
    public String editScreen(Model model, @PathVariable Integer id) {
        User user = UserRepository.getById(id);
        model.addAttribute("user", user);
        return "user/edit";
    }

    @PostMapping(value = "/user/editar")
    public String edit(User user) {
        UserRepository.update(user.getId(), user);

        return "redirect:/user";
    }

    @GetMapping(value = "/user/{id}/remove")
    public String remove(@PathVariable Integer id) {
        UserRepository.remove(id);
        return "redirect:/user";
    }

}
