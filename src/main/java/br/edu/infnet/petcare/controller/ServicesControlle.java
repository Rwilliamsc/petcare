package br.edu.infnet.petcare.controller;

import br.edu.infnet.petcare.model.domain.Services;
import br.edu.infnet.petcare.model.service.ServicesService;
import br.edu.infnet.petcare.model.service.VeterinaryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ServicesControlle {

    @Autowired
    private ServicesService servicesService;

    private String msg;
    private String typeAlert;

    @GetMapping("/services")
    public String listScreen(Model model) {
        model.addAttribute("services", servicesService.list());

        model.addAttribute("msg", msg);
        model.addAttribute("typeAlert", typeAlert);

        msg = null;
        typeAlert = null;
        return "services/list";
    }

    @GetMapping(value = "/services/{id}/remove")
    public String remove(@PathVariable Integer id) {
        try {
            servicesService.remove(id);
            msg = "Registro removido com sucesso.";
            typeAlert = "success";
            return "redirect:/services";
        } catch (Exception e) {
            msg = "Não foi possivel remover este registro.";
            typeAlert = "danger";
            return "redirect:/services";
        }

    }

}
