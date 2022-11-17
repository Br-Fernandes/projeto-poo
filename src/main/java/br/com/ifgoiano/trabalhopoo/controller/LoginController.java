package br.com.ifgoiano.trabalhopoo.controller;

import br.com.ifgoiano.trabalhopoo.respositorys.AlunoRepository;
import br.com.ifgoiano.trabalhopoo.respositorys.CoordenadorRepository;
import br.com.ifgoiano.trabalhopoo.respositorys.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class LoginController {

    private final AlunoRepository alunoRepository;
    private final ProfessorRepository professorRepository;
    private final CoordenadorRepository coordenadorRepository;

    @Autowired
    public LoginController(AlunoRepository alunoRepository, ProfessorRepository professorRepository, CoordenadorRepository coordenadorRepository) {
        this.alunoRepository = alunoRepository;
        this.professorRepository = professorRepository;
        this.coordenadorRepository = coordenadorRepository;
    }

    @GetMapping("/login")
    public ResponseEntity<Object> getLoginUser(@PathVariable(value = "email") String email, @PathVariable(value = "mat") String password) {
        if (alunoRepository.existsByEmail(email) && alunoRepository.existsById(password)){
            return (ResponseEntity<Object>) ResponseEntity.status(HttpStatus.OK);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Dados incorretos");
        }
    }

}
