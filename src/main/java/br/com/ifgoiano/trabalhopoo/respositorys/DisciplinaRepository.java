package br.com.ifgoiano.trabalhopoo.respositorys;

import br.com.ifgoiano.trabalhopoo.models.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;
import java.util.UUID;

public interface DisciplinaRepository extends JpaRepository<Disciplina, UUID> {


    boolean existsBySubjectName(String subjectName);

    @Query(value = "select tb_disciplina.subject_name from tb_disciplina where tb_disciplina.id_Professor= :gambiarra", nativeQuery = true)
    ArrayList<String> findAllSubjectByIdProfessor(Long gambiarra);
}
