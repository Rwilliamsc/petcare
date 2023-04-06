package br.edu.infnet.petcare.controller;

import br.edu.infnet.petcare.model.domain.Schedule;
import br.edu.infnet.petcare.model.domain.User;
import br.edu.infnet.petcare.model.service.ScheduleService;
import br.edu.infnet.petcare.model.service.ServicesService;
import br.edu.infnet.petcare.model.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class ScheduleController {

    @Autowired
    private ScheduleService scheduleService;
    @Autowired
    private ServicesService servicesService;
    @Autowired
    private UserService userService;

    private String msg;
    private String typeAlert;

    @GetMapping("/schedule")
    public String listScreen(Model model, @SessionAttribute("sessionUser") User user) {
        if (user.getType().equalsIgnoreCase("ADMINISTRATOR")) {
            model.addAttribute("schedules", scheduleService.list());
        } else {
            model.addAttribute("schedules", scheduleService.getByUser(user.getId()));
        }

        model.addAttribute("msg", msg);
        model.addAttribute("typeAlert", typeAlert);

        msg = null;
        typeAlert = null;

        return "schedule/list";
    }

    @GetMapping("/schedule/register")
    public String createScreen(Model model, @SessionAttribute("sessionUser") User user) {
        User u = userService.getById(user.getId());
        model.addAttribute("services", servicesService.list());
        model.addAttribute("pets", u.getPets());
        return "schedule/register";
    }

    @PostMapping("/schedule")
    public String create(Schedule schedule, @SessionAttribute("sessionUser") User user) {

        schedule.setVet(schedule.getService().getVet());
        schedule.setDate(schedule.getService().getAvailableDate());
        schedule.setUser(user);

        Schedule sched = scheduleService.create(schedule);
        if (sched != null) {
            msg = "Agendamento realizado com sucesso.";
            typeAlert = "success";
            return "redirect:/schedule";
        }
        msg = "Não foi possivel realizar este agendamento.";
        typeAlert = "warning";
        return "schedule/register";
    }

    @GetMapping(value = "/schedule/{id}/edit")
    public String editScreen(Model model, @PathVariable Integer id) {
        Schedule schedule = scheduleService.getById(id);
        model.addAttribute("schedule", schedule);
        return "schedule/edit";
    }

    @PostMapping(value = "/schedule/editar")
    public String edit(Schedule schedule) {
        scheduleService.update(schedule.getId(), schedule);

        return "redirect:/schedule";
    }

    @GetMapping(value = "/schedule/{id}/remove")
    public String remove(@PathVariable Integer id) {
        try {
            scheduleService.remove(id);
            msg = "Agendamento removido com sucesso.";
            typeAlert = "success";
            return "redirect:/schedule";
        } catch (Exception e) {
            msg = "Não foi possivel remover este agendamento.";
            typeAlert = "danger";
            return "redirect:/schedule";
        }
    }
}
