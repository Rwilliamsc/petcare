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

@Controller
public class PetController {

    @Autowired
    private PetService petService;
    @Autowired
    private UserService userService;

    @GetMapping("/pet")
    public String listScreen(Model model) {
        model.addAttribute("pets", petService.list());
        return "pet/list";
    }

    @GetMapping("/pet/register/{id}")
    public String createScreen(Model model, @PathVariable Integer id) {
        User user = userService.getById(id);
        model.addAttribute("user", user);
        return "pet/register";
    }

    @PostMapping("/pet")
    public String create(Pet pet) {
        int userId = pet.getUserId();
        if (petService.create(pet)){
           
            return "redirect:/user/"+userId+"/edit";
        }
        return "pet/register";
    }

    @GetMapping(value = "/pet/{id}/edit")
    public String editScreen(Model model, @PathVariable Integer id) {
        Pet pet = petService.getById(id);
        model.addAttribute("pet", pet);
        return "pet/edit";
    }

    @PostMapping(value = "/pet/edit")
    public String edit(Pet pet) {
        petService.update(pet.getId(), pet);

        return "redirect:/pet/list";
    }

    @GetMapping(value = "/pet/{id}/remove")
    public String remove(@PathVariable Integer id) {
        Pet pet = petService.remove(id);
        return "redirect:/user/"+pet.getUserId()+"/edit";
    }
}
