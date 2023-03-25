package br.edu.infnet.petcare.controller;

import br.edu.infnet.petcare.model.domain.User;
import br.edu.infnet.petcare.model.service.PetService;
import br.edu.infnet.petcare.model.service.UserService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class UserController {

    @Autowired
	private UserService userService;

    @GetMapping("/user")
    public String listScreen(Model model, @SessionAttribute("sessionUser") User user) {
       
        if(user.getType().equalsIgnoreCase("ADMINISTRATOR")){
            model.addAttribute("users", userService.list());
        }else {
            List<User> userlist = new ArrayList<User>();
            userlist.add(user);
            model.addAttribute("users", userlist);
        }
        return "user/list";
    }

    @GetMapping("/user/register")
    public String createScreen() {
        return "user/register";
    }

    @PostMapping("/user")
    public String create(User user) {
        User userCreated = userService.create(user);
        if (userCreated != null){
            return "redirect:/login";
        }
        return "user/register";
    }

    @GetMapping(value = "/user/{id}/edit")
    public String editScreen(Model model, @PathVariable Integer id) {
        User user = userService.getById(id);
        model.addAttribute("user", user);
        model.addAttribute("pets", user.getPets());
        return "user/edit";
    }

    @PostMapping(value = "/user/edit/{id}")
    public String edit(User user) {
        userService.update(user.getId(), user);
        return "redirect:/user";
    }

    @GetMapping(value = "/user/{id}/remove")
    public String remove(@PathVariable Integer id) {
        userService.remove(id);
        return "redirect:/user";
    }

}
