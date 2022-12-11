package br.com.ifgoiano.trabalhopoo.controller;

import br.com.ifgoiano.trabalhopoo.models.Aluno;
import br.com.ifgoiano.trabalhopoo.models.Avaliacao;
import br.com.ifgoiano.trabalhopoo.models.Disciplina;
import br.com.ifgoiano.trabalhopoo.services.LoginServices;
import br.com.ifgoiano.trabalhopoo.services.ProfessorServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.ArrayList;

@Controller
public class ProfessorController {

    final ProfessorServices professorServices;
    final LoginServices loginServices;

    @Autowired
    public ProfessorController(ProfessorServices professorServices, LoginServices loginServices) {
        this.professorServices = professorServices;
        this.loginServices = loginServices;

    }

    @GetMapping("/professorPage")
    public String professor() { return "professorPage"; }

    @GetMapping("/notaAlunos")
    public String getAllStudents(Model model){
        System.out.println(LoginController.gambiarra);
        ArrayList<Avaliacao> alunos = professorServices.findAllByIdProfessor(LoginController.gambiarra);
        model.addAttribute("estudantes", alunos);
        return "visualizarAlunos";
    }

    @GetMapping("/diarioNotas")
    public String getGradeDiary(Model model, Model model2, Model model3, Model model4){
        model.addAttribute("aluno", new Aluno());
        model2.addAttribute("disciplina", new Disciplina());
        model3.addAttribute("avaliacao", new Avaliacao());

        ArrayList<String> subjects = professorServices.findAllSubjectByIdProfessor(LoginController.gambiarra);
        model4.addAttribute("disciplinas", subjects);
        return "diarioNotas";
    }

    @PostMapping("/diarioNotas")
    public String setGradeDiary(@ModelAttribute("aluno")@Valid Aluno aluno,
                                @ModelAttribute("disciplina") @Valid Disciplina disciplina,
                                @ModelAttribute("avaliacao") @Valid Avaliacao avaliacao,
                                Error error) {
        if (loginServices.existsById(aluno.getIdUser()) && professorServices.existsBySubjectName(disciplina.getSubjectName())){
            Avaliacao ava = new Avaliacao();
            ava.setIdStudent(aluno.getIdUser());
            ava.setNameStudent(professorServices.findNameById(aluno.getIdUser()));
            ava.setIdProfessor(LoginController.gambiarra);
            ava.setSubjectName(disciplina.getSubjectName());
            ava.setGrade(avaliacao.getGrade());

            professorServices.saveAvaliacao(ava);
            return "redirect:/diarioNotas";
        }
        //error.addSuppressed(new Throwable("Aluno não matriculado"));
        return "redirect:/diarioNotas";
    }
}
