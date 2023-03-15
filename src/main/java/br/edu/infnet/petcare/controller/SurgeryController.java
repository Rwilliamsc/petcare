package br.edu.infnet.petcare.controller;

import br.edu.infnet.petcare.model.domain.Surgery;
import br.edu.infnet.petcare.model.repository.SurgeryRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SurgeryController {

    @GetMapping("/surgery")
    public String listScreen(Model model) {
        model.addAttribute("surgeries", SurgeryRepository.list());
        return "surgery/list";
    }

    @GetMapping("/surgery/register")
    public String createScreen() {
        return "surgery/register";
    }

    @PostMapping("/surgery")
    public String create(Surgery surgery) {
        if (SurgeryRepository.create(surgery)){
           
            return "redirect:/surgery/list";
        }
        return "surgery/register";
    }

    @GetMapping(value = "/surgery/{id}/edit")
    public String editScreen(Model model, @PathVariable Integer id) {
        Surgery surgery = SurgeryRepository.getById(id);
        model.addAttribute("surgery", surgery);
        return "surgery/edit";
    }

    @PostMapping(value = "/surgery/editar")
    public String edit(Surgery surgery) {
        SurgeryRepository.update(surgery.getId(), surgery);

        return "redirect:/surgery/list";
    }

    @GetMapping(value = "/surgery/{id}/remove")
    public String remove(@PathVariable Integer id) {
        SurgeryRepository.remove(id);
        return "redirect:/surgery/list";
    }

}
