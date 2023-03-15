package br.edu.infnet.petcare.controller;

import br.edu.infnet.petcare.model.domain.Appointment;
import br.edu.infnet.petcare.model.repository.AppointmentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppointmentController {

    @GetMapping("/appointment")
    public String listScreen(Model model) {
        model.addAttribute("appointments", AppointmentRepository.list());
        return "appointment/list";
    }

    @GetMapping("/appointment/register")
    public String createScreen() {
        return "appointment/register";
    }

    @PostMapping("/appointment")
    public String create(Appointment appointment) {
        if (AppointmentRepository.create(appointment)){
           
            return "redirect:/appointment/list";
        }
        return "appointment/register";
    }

    @GetMapping(value = "/appointment/{id}/edit")
    public String editScreen(Model model, @PathVariable Integer id) {
        Appointment appointment = AppointmentRepository.getById(id);
        model.addAttribute("appointment", appointment);
        return "appointment/edit";
    }

    @PostMapping(value = "/appointment/editar")
    public String edit(Appointment appointment) {
        AppointmentRepository.update(appointment.getId(), appointment);

        return "redirect:/appointment/list";
    }

    @GetMapping(value = "/appointment/{id}/remove")
    public String remove(@PathVariable Integer id) {
        AppointmentRepository.remove(id);
        return "redirect:/appointment/list";
    }

}
