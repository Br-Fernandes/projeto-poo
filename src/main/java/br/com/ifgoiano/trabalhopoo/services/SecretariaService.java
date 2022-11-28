package br.com.ifgoiano.trabalhopoo.services;

import br.com.ifgoiano.trabalhopoo.models.Aluno;
import br.com.ifgoiano.trabalhopoo.models.AlunosDisciplinas;
import br.com.ifgoiano.trabalhopoo.models.Professor;
import br.com.ifgoiano.trabalhopoo.respositorys.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SecretariaService {

    final AlunoRepository alunoRepository;
    final CoordenadorRepository coordenadorRepository;
    final ProfessorRepository professorRepository;
    final DisciplinaRepository disciplinaRepository;
    final AlunoDisciplinaRepository alunoDisciplinaRepository;
    final ProfessorDisciplinaRepository professorDisciplinaRepository;

    @Autowired
    public SecretariaService(AlunoRepository alunoRepository, CoordenadorRepository coordenadorRepository,
                             ProfessorRepository professorRepository, DisciplinaRepository disciplinaRepository, AlunoDisciplinaRepository alunoDisciplinaRepository, ProfessorDisciplinaRepository professorDisciplinaRepository) {
        this.alunoRepository = alunoRepository;
        this.coordenadorRepository = coordenadorRepository;
        this.professorRepository = professorRepository;
        this.disciplinaRepository = disciplinaRepository;
        this.alunoDisciplinaRepository = alunoDisciplinaRepository;
        this.professorDisciplinaRepository = professorDisciplinaRepository;
    }


    public void setRegisterProfessor(Professor professor) {
        professorRepository.save(professor);
    }

    public void setRegisterAluno(Aluno aluno) {
        alunoRepository.save(aluno);
    }

    public boolean existsBySubjectName(String subjectName) {
        return disciplinaRepository.existsBySubjectName(subjectName);
    }

    public void setAlunoDisciplina(String subjectName, Long idUser) {
        AlunosDisciplinas alunosDisciplinas = new AlunosDisciplinas();
        alunosDisciplinas.setSubjectName(subjectName);
        alunosDisciplinas.setIdAluno(idUser);

        alunoDisciplinaRepository.save(alunosDisciplinas);
    }
}

