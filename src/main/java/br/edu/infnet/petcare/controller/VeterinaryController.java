package br.edu.infnet.petcare.controller;

import br.edu.infnet.petcare.model.domain.Veterinary;
import br.edu.infnet.petcare.model.service.VeterinaryService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class VeterinaryController {

    @Autowired
	private VeterinaryService veterinaryService;

    @GetMapping("/veterinary")
    public String listScreen(Model model) {
        model.addAttribute("veterinaries", veterinaryService.list());
        return "veterinary/list";
    }

    @GetMapping("/veterinary/register")
    public String createScreen() {
        return "veterinary/register";
    }

    @PostMapping("/veterinary")
    public String create(Veterinary veterinary) {
        Veterinary vet = veterinaryService.create(veterinary);
        if (vet != null){
            return "redirect:/veterinary";
        }
        return "veterinary/register";
    }

    @GetMapping(value = "/veterinary/{id}/edit")
    public String editScreen(Model model, @PathVariable Integer id) {
        Veterinary veterinary = veterinaryService.getById(id);
        model.addAttribute("vet", veterinary);
        return "veterinary/edit";
    }

    @PostMapping(value = "/veterinary/edit/{id}")
    public String edit(Veterinary veterinary) {
        veterinaryService.update(veterinary.getId(), veterinary);
        return "redirect:/veterinary";
    }

    @GetMapping(value = "/veterinary/{id}/remove")
    public String remove(@PathVariable Integer id) {
        veterinaryService.remove(id);
        return "redirect:/veterinary";
    }

}
