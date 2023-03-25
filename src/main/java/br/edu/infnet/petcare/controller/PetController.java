package br.edu.infnet.petcare.controller;

import br.edu.infnet.petcare.model.domain.Pet;
import br.edu.infnet.petcare.model.domain.User;
import br.edu.infnet.petcare.model.service.PetService;
import br.edu.infnet.petcare.model.service.UserService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class PetController {

    @Autowired
    private PetService petService;

    @GetMapping("/pet")
    public String listScreen(Model model) {
        model.addAttribute("pets", petService.list());
        return "pet/list";
    }

    @GetMapping("/pet/register")
    public String createScreen(Model model, @SessionAttribute("sessionUser") User user) {
        model.addAttribute("user", user);
        return "pet/register";
    }

    @PostMapping("/pet")
    public String create(Pet pet, @SessionAttribute("sessionUser") User user) {
        pet.setUser(user);
        Pet p = petService.create(pet);
        
        if (p != null){
            return "redirect:/user/"+user.getId()+"/edit";
        }
        return "pet/register";
    }

    @GetMapping(value = "/pet/{id}/edit")
    public String editScreen(Model model, @PathVariable Integer id) {
        model.addAttribute("pet", petService.getById(id));
        return "pet/edit";
    }

    @PostMapping(value = "/pet/edit")
    public String edit(Pet pet) {
        petService.update(pet.getId(), pet);

        return "redirect:/pet/list";
    }

    @GetMapping(value = "/pet/{id}/remove")
    public String remove(@PathVariable Integer id, @SessionAttribute("sessionUser") User user) {
       petService.remove(id);
       return "redirect:/user/"+user.getId()+"/edit";
    }
}
