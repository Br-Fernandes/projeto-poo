package br.com.ifgoiano.trabalhopoo.services;

import br.com.ifgoiano.trabalhopoo.models.Aluno;
import br.com.ifgoiano.trabalhopoo.models.Avaliacao;
import br.com.ifgoiano.trabalhopoo.respositorys.AlunoRepository;
import br.com.ifgoiano.trabalhopoo.respositorys.AvaliacaoRepository;
import br.com.ifgoiano.trabalhopoo.respositorys.DisciplinaRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Getter
@Setter
@Service
public class ProfessorServices {

    private Long professorGambiarra;

    final AvaliacaoRepository avaliacaoRepository;
    final AlunoRepository alunoRepository;
    final DisciplinaRepository disciplinaRepository;

    @Autowired
    public ProfessorServices(AvaliacaoRepository avaliacaoRepository, AlunoRepository alunoRepository, DisciplinaRepository disciplinaRepository) {
        this.avaliacaoRepository = avaliacaoRepository;
        this.alunoRepository = alunoRepository;
        this.disciplinaRepository = disciplinaRepository;
    }

    public ArrayList<Avaliacao> findAllByIdProfessor(Long gambiarra) {
        return avaliacaoRepository.findAllByIdProfessor(gambiarra);
    }

    public boolean existsBySubjectName(String subjectName) {
        return disciplinaRepository.existsBySubjectName(subjectName);
    }

    public Optional<Aluno> findById(String id){
        return alunoRepository.findById(id);
    }

    public void saveAvaliacao(Avaliacao ava) {
        avaliacaoRepository.save(ava);
    }

    public String findNameById(Long idUser) {
        return alunoRepository.findNameById(idUser);
    }

    public ArrayList<String> findAllSubjectByIdProfessor(Long gambiarra) {
        return disciplinaRepository.findAllSubjectByIdProfessor(gambiarra);
    }
}
