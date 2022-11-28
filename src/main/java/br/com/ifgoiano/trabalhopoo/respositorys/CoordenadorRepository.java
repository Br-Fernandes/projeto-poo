package br.com.ifgoiano.trabalhopoo.respositorys;

import br.com.ifgoiano.trabalhopoo.models.Coordenador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoordenadorRepository  extends JpaRepository<Coordenador, String> {

    boolean existsByEmail(String email);

    boolean existsByIdUser(Long id);
}
