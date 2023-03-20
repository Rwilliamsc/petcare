package br.edu.infnet.petcare.controller;

import br.edu.infnet.petcare.model.domain.Appointment;
import br.edu.infnet.petcare.model.service.AppointmentService;
import br.edu.infnet.petcare.model.service.VeterinaryService;

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
    @Autowired
    private VeterinaryService veterinaryService;

    @GetMapping("/appointment")
    public String listScreen(Model model) {
        model.addAttribute("appointments", appointmentService.list());
        return "appointment/list";
    }

    @GetMapping("/appointment/register")
    public String createScreen(Model model) {
        model.addAttribute("veterinaries", veterinaryService.list());
        return "appointment/register";
    }

    @PostMapping("/appointment")
    public String create(Appointment appointment) {
        if (appointmentService.create(appointment)){
           
            return "redirect:/appointment";
        }
        return "appointment/register";
    }

    @GetMapping(value = "/appointment/{id}/edit")
    public String editScreen(Model model, @PathVariable Integer id) {
        Appointment appointment = appointmentService.getById(id);
        model.addAttribute("appointment", appointment);
        model.addAttribute("veterinaries", veterinaryService.list());
        return "appointment/edit";
    }

    @PostMapping(value = "/appointment/edit/{id}")
    public String edit(Appointment appointment) {
        System.out.println(appointment.getId());
        System.out.println(appointment.getName());
        System.out.println(appointment.getLevel());
        appointmentService.update(appointment.getId(), appointment);

        return "redirect:/appointment";
    }

    @GetMapping(value = "/appointment/{id}/remove")
    public String remove(@PathVariable Integer id) {
        appointmentService.remove(id);
        return "redirect:/appointment/list";
    }

}
