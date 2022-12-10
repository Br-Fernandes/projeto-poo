package br.com.ifgoiano.trabalhopoo.controller;

import br.com.ifgoiano.trabalhopoo.models.Avaliacao;
import br.com.ifgoiano.trabalhopoo.services.AlunoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class AlunoController {

    final AlunoServices alunoServices;

    @Autowired
    public AlunoController(AlunoServices alunoServices) {
        this.alunoServices = alunoServices;
    }

    @GetMapping("/alunoPage")
    public String aluno(Model model){
        System.out.println(LoginController.gambiarra);
        ArrayList<Avaliacao> tests = alunoServices.findGradeById(LoginController.gambiarra);
        model.addAttribute("avaliacoes", tests);
        return "alunoPage";
    }
}
