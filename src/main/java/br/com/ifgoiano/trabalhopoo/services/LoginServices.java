package br.com.ifgoiano.trabalhopoo.services;

import br.com.ifgoiano.trabalhopoo.respositorys.AlunoRepository;
import br.com.ifgoiano.trabalhopoo.respositorys.CoordenadorRepository;
import br.com.ifgoiano.trabalhopoo.respositorys.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginServices {

    private final AlunoRepository alunoRepository;
    private final ProfessorRepository professorRepository;
    private final CoordenadorRepository coordenadorRepository;

    @Autowired
    public LoginServices(AlunoRepository alunoRepository, ProfessorRepository professorRepository, CoordenadorRepository coordenadorRepository) {
        this.alunoRepository = alunoRepository;
        this.professorRepository = professorRepository;
        this.coordenadorRepository = coordenadorRepository;
    }

    public boolean existsByEmailAluno(String email){
        return alunoRepository.existsByEmail(email);
    }

    public boolean existsByEmailProfessor(String email){
        return professorRepository.existsByEmail(email);
    }

    public boolean existsByEmailCoordenador(String email){
        return coordenadorRepository.existsByEmail(email);
    }

}
