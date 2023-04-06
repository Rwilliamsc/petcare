package br.edu.infnet.petcare.controller;

import br.edu.infnet.petcare.model.domain.Exam;
import br.edu.infnet.petcare.model.service.ExamService;
import br.edu.infnet.petcare.model.service.VeterinaryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ExamController {

    @Autowired
    private ExamService examService;
    @Autowired
    private VeterinaryService veterinaryService;

    private String msg;
    private String typeAlert;

    @GetMapping("/exam")
    public String listScreen(Model model) {
        model.addAttribute("exams", examService.list());

        model.addAttribute("msg", msg);
        model.addAttribute("typeAlert", typeAlert);

        msg = null;
        typeAlert = null;
        return "exam/list";
    }

    @GetMapping("/exam/register")
    public String createScreen(Model model) {
        model.addAttribute("veterinaries", veterinaryService.list());
        return "exam/register";
    }

    @PostMapping("/exam")
    public String create(Exam exam) {
        Exam service = examService.create(exam);
        if (service != null) {
            msg = "Registro criado com sucesso.";
            typeAlert = "success";
            return "redirect:/exam";
        }
        return "exam/register";
    }

    @GetMapping(value = "/exam/{id}/edit")
    public String editScreen(Model model, @PathVariable Integer id) {
        Exam exam = examService.getById(id);
        model.addAttribute("exam", exam);
        model.addAttribute("veterinaries", veterinaryService.list());
        return "exam/edit";
    }

    @PostMapping(value = "/exam/edit/{id}")
    public String edit(Exam exam) {
        examService.update(exam.getId(), exam);
        return "redirect:/exam";
    }

    @GetMapping(value = "/exam/{id}/remove")
    public String remove(@PathVariable Integer id) {
        try {
            examService.remove(id);
            msg = "Registro removido com sucesso.";
            typeAlert = "success";
            return "redirect:/exam";
        } catch (Exception e) {
            msg = "Não foi possivel remover este registro.";
            typeAlert = "danger";
            return "redirect:/exam";
        }

    }

}
