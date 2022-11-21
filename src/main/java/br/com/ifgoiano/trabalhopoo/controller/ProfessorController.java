package br.com.ifgoiano.trabalhopoo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfessorController {

    @GetMapping("/professorPage")
    public String professor() {
        return "professorPage";
    }

}
