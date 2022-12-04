package br.com.ifgoiano.trabalhopoo.respositorys;

import br.com.ifgoiano.trabalhopoo.models.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AlunoRepository  extends JpaRepository<Aluno, String> {

    boolean existsByEmail(String email);

    boolean existsByIdUser(Long id);

    @Query(value = "select tb_aluno.name from tb_aluno where tb_aluno.id_user= :idUser", nativeQuery = true)
    String findNameById(@Param("idUser") Long idUser);
}
