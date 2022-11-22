package br.com.ifgoiano.trabalhopoo.controller;

import br.com.ifgoiano.trabalhopoo.models.Usuario;
import br.com.ifgoiano.trabalhopoo.services.LoginServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    final LoginServices loginServices;

    @Autowired
    public LoginController(LoginServices loginServices) {
        this.loginServices = loginServices;
    }


    @GetMapping("/")
    public String index() {
        return "index";
    }


    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("user", new Usuario());
        return "login";

    }

    @PostMapping("/login")
    public String getLoginUser( @ModelAttribute("user") Usuario user, Error error) {
        String teste = "";
        if(loginServices.existsAluno(user.getEmail(),user.getId())){
            return "redirect:/alunoPage?user=" + user.getId();
        } else if (loginServices.existsProfessor(user.getEmail(), user.getId())) {
            return "redirect:/professorPage";
        } else if (loginServices.existsCoordenador(user.getEmail(), user.getId())) {
            return "redirect:/coordenadorPage";
        } else {
            error.addSuppressed(new Throwable("Login errado"));
            return "login";
        }

    }



}
