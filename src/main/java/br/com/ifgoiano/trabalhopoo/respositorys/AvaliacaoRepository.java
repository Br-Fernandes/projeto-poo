package br.com.ifgoiano.trabalhopoo.respositorys;

import br.com.ifgoiano.trabalhopoo.models.Avaliacao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.UUID;

public interface AvaliacaoRepository extends JpaRepository<Avaliacao, UUID> {

    @Query(value = "SELECT * from tb_avaliacao where tb_avaliacao.id_professor= :gambiarra", nativeQuery = true)
    ArrayList<Avaliacao> findAllTestByIdProfessor(Long gambiarra);

    @Query(value = "SELECT * from tb_avaliacao where tb_avaliacao.id_student= :gambiarra", nativeQuery = true)
    ArrayList<Avaliacao> findGradeById(Long gambiarra);
}
