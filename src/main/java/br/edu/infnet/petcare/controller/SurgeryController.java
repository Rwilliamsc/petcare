package br.edu.infnet.petcare.controller;

import br.edu.infnet.petcare.model.domain.Surgery;
import br.edu.infnet.petcare.model.service.SurgeryService;
import br.edu.infnet.petcare.model.service.VeterinaryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SurgeryController {

    @Autowired
    private SurgeryService surgeryService;
    @Autowired
    private VeterinaryService veterinaryService;

    private String msg;
    private String typeAlert;

    @GetMapping("/surgery")
    public String listScreen(Model model) {
        model.addAttribute("surgeries", surgeryService.list());

        model.addAttribute("msg", msg);
        model.addAttribute("typeAlert", typeAlert);

        msg = null;
        typeAlert = null;
        return "surgery/list";
    }

    @GetMapping("/surgery/register")
    public String createScreen(Model model) {
        model.addAttribute("veterinaries", veterinaryService.list());
        return "surgery/register";
    }

    @PostMapping("/surgery")
    public String create(Surgery surgery) {
        Surgery service = surgeryService.create(surgery);
        if (service != null) {
            return "redirect:/surgery";
        }
        return "surgery/register";
    }

    @GetMapping(value = "/surgery/{id}/edit")
    public String editScreen(Model model, @PathVariable Integer id) {
        Surgery surgery = surgeryService.getById(id);
        model.addAttribute("surgery", surgery);
        model.addAttribute("veterinaries", veterinaryService.list());
        return "surgery/edit";
    }

    @PostMapping(value = "/surgery/edit/{id}")
    public String edit(Surgery surgery) {
        surgeryService.update(surgery.getId(), surgery);

        return "redirect:/surgery";
    }

    @GetMapping(value = "/surgery/{id}/remove")
    public String remove(@PathVariable Integer id) {
        try {
            surgeryService.remove(id);
            msg = "Registro removido com sucesso.";
            typeAlert = "success";
            return "redirect:/surgery";
        } catch (Exception e) {
            msg = "Não foi possivel remover este registro.";
            typeAlert = "danger";
            return "redirect:/surgery";
        }
    }

}
