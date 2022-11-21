package br.com.ifgoiano.trabalhopoo.services;

import br.com.ifgoiano.trabalhopoo.respositorys.AlunoRepository;
import br.com.ifgoiano.trabalhopoo.respositorys.CoordenadorRepository;
import br.com.ifgoiano.trabalhopoo.respositorys.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
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

    public boolean existsAluno(String email, Long id) {
        return alunoRepository.existsByEmail(email) && alunoRepository.existsById(id);
    }

    public boolean existsProfessor(String email, Long id) {
        return professorRepository.existsByEmail(email) && professorRepository.existsById(id);
    }


    public boolean existsCoordenador(String email, Long id) {
        return coordenadorRepository.existsByEmail(email) && coordenadorRepository.existsById(id);
    }
}
