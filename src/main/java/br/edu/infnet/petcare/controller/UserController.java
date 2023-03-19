package br.edu.infnet.petcare.controller;

import br.edu.infnet.petcare.model.domain.User;
import br.edu.infnet.petcare.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
	private UserService userService;

    @GetMapping("/user")
    public String listScreen(Model model) {
        model.addAttribute("users", userService.list());
        return "user/list";
    }

    @GetMapping("/user/register")
    public String createScreen() {
        return "user/register";
    }

    @PostMapping("/user")
    public String create(User user) {
        if (userService.create(user)){
            return "redirect:/login";
        }
        return "user/register";
    }

    @GetMapping(value = "/user/{id}/edit")
    public String editScreen(Model model, @PathVariable Integer id) {
        User user = userService.getById(id);
        model.addAttribute("user", user);
        return "user/edit";
    }

    @PostMapping(value = "/user/edit/{id}")
    public String edit(User user) {
        // System.out.println(id);
    	System.out.println(user.getId());
        User userUpdated = userService.update(user.getId(), user);
        System.out.println(userUpdated);

        return "redirect:/user";
    }

    @GetMapping(value = "/user/{id}/remove")
    public String remove(@PathVariable Integer id) {
        userService.remove(id);
        return "redirect:/user";
    }

}
