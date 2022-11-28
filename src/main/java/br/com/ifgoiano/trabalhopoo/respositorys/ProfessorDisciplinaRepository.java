package br.com.ifgoiano.trabalhopoo.respositorys;

import br.com.ifgoiano.trabalhopoo.models.ProfessoresDisciplina;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProfessorDisciplinaRepository extends JpaRepository<ProfessoresDisciplina, UUID> {

}
