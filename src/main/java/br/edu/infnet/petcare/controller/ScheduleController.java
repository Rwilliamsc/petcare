package br.edu.infnet.petcare.controller;

import br.edu.infnet.petcare.model.domain.Schedule;
import br.edu.infnet.petcare.model.repository.ScheduleRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ScheduleController {

    @GetMapping("/schedule")
    public String listScreen(Model model) {
        model.addAttribute("schedules", ScheduleRepository.list());
        return "schedule/list";
    }

    @GetMapping("/schedule/register")
    public String createScreen() {
        return "schedule/register";
    }

    @PostMapping("/schedule")
    public String create(Schedule schedule) {
        if (ScheduleRepository.create(schedule)){
           
            return "redirect:/schedule/list";
        }
        return "schedule/register";
    }

    @GetMapping(value = "/schedule/{id}/edit")
    public String editScreen(Model model, @PathVariable Integer id) {
        Schedule schedule = ScheduleRepository.getById(id);
        model.addAttribute("schedule", schedule);
        return "schedule/edit";
    }

    @PostMapping(value = "/schedule/editar")
    public String edit(Schedule schedule) {
        ScheduleRepository.update(schedule.getId(), schedule);

        return "redirect:/schedule/list";
    }

    @GetMapping(value = "/schedule/{id}/remove")
    public String remove(@PathVariable Integer id) {
        ScheduleRepository.remove(id);
        return "redirect:/schedule/list";
    }

}
