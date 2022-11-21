package br.com.ifgoiano.trabalhopoo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CoordenadorController {

    @GetMapping("/coordenadorPage")
    public String coordenador() {
        return "coordenadorPage";
    }

}
