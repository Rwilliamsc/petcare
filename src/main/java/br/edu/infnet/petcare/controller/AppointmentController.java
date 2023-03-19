package br.edu.infnet.petcare.controller;

import br.edu.infnet.petcare.model.domain.Appointment;
import br.edu.infnet.petcare.model.service.AppointmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @GetMapping("/appointment")
    public String listScreen(Model model) {
        model.addAttribute("appointments", appointmentService.list());
        return "appointment/list";
    }

    @GetMapping("/appointment/register")
    public String createScreen() {
        return "appointment/register";
    }

    @PostMapping("/appointment")
    public String create(Appointment appointment) {
        if (appointmentService.create(appointment)){
           
            return "redirect:/appointment/list";
        }
        return "appointment/register";
    }

    @GetMapping(value = "/appointment/{id}/edit")
    public String editScreen(Model model, @PathVariable Integer id) {
        Appointment appointment = appointmentService.getById(id);
        model.addAttribute("appointment", appointment);
        return "appointment/edit";
    }

    @PostMapping(value = "/appointment/editar")
    public String edit(Appointment appointment) {
        appointmentService.update(appointment.getId(), appointment);

        return "redirect:/appointment/list";
    }

    @GetMapping(value = "/appointment/{id}/remove")
    public String remove(@PathVariable Integer id) {
        appointmentService.remove(id);
        return "redirect:/appointment/list";
    }

}
