package br.com.ifgoiano.trabalhopoo.respositorys;

import br.com.ifgoiano.trabalhopoo.models.Avaliacao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.UUID;

public interface AvaliacaoRepository extends JpaRepository<Avaliacao, UUID> {


    @Query(value = "SELECT * from tb_avaliacao where tb_avaliacao.name", nativeQuery = true)
    Object findAllByIdProfessor();
}
