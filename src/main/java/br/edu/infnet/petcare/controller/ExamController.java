package br.edu.infnet.petcare.controller;

import br.edu.infnet.petcare.model.domain.Exam;
import br.edu.infnet.petcare.model.repository.ExamRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ExamController {

    @GetMapping("/exam")
    public String listScreen(Model model) {
        model.addAttribute("exams", ExamRepository.list());
        return "exam/list";
    }

    @GetMapping("/exam/register")
    public String createScreen() {
        return "exam/register";
    }

    @PostMapping("/exam")
    public String create(Exam exam) {
        if (ExamRepository.create(exam)){
           
            return "redirect:/exam/list";
        }
        return "exam/register";
    }

    @GetMapping(value = "/exam/{id}/edit")
    public String editScreen(Model model, @PathVariable Integer id) {
        Exam exam = ExamRepository.getById(id);
        model.addAttribute("exam", exam);
        return "exam/edit";
    }

    @PostMapping(value = "/exam/editar")
    public String edit(Exam exam) {
        ExamRepository.update(exam.getId(), exam);

        return "redirect:/exam/list";
    }

    @GetMapping(value = "/exam/{id}/remove")
    public String remove(@PathVariable Integer id) {
        ExamRepository.remove(id);
        return "redirect:/exam/list";
    }

}
