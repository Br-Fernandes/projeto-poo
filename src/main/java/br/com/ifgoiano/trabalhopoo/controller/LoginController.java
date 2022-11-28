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
        if (user.getEmail().equals("secretaria@gmail.com") && user.getIdUser() == 1111111){
            return "redirect:/secretaria";
        } else if(loginServices.existsAluno(user.getEmail(),user.getIdUser())){
            return "redirect:/alunoPage";
        } else if (loginServices.existsProfessor(user.getEmail(), user.getIdUser())) {
            return "redirect:/professorPage";
        } else if (loginServices.existsCoordenador(user.getEmail(), user.getIdUser())) {
            return "redirect:/coordenadorPage";
        } else {
            error.addSuppressed(new Throwable("Login errado"));
            return "login";
        }

    }

}
