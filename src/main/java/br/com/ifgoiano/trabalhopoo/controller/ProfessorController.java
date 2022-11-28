package br.com.ifgoiano.trabalhopoo.controller;

import br.com.ifgoiano.trabalhopoo.models.Avaliacao;
import br.com.ifgoiano.trabalhopoo.respositorys.AvaliacaoRepository;
import br.com.ifgoiano.trabalhopoo.services.ProfessorServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class ProfessorController {

    final ProfessorServices professorServices;

    @Autowired
    public ProfessorController(ProfessorServices professorServices) {
        this.professorServices = professorServices;
    }

    @GetMapping("/professorPage")
    public String professor() {
        return "professorPage";
    }

    @GetMapping("/notaAlunos")
    public String getAllStudents(Model model){
        ArrayList<Avaliacao> alunos = (ArrayList<Avaliacao>) professorServices.findAll();
        System.out.println(alunos.size());
        model.addAttribute("estudantes", alunos);
        return "visualizarAlunos";
    }

}
