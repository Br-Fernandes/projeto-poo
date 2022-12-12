package br.com.ifgoiano.trabalhopoo.respositorys;

import br.com.ifgoiano.trabalhopoo.models.AlunosDisciplinas;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AlunoDisciplinaRepository extends JpaRepository<AlunosDisciplinas, UUID> {

}
