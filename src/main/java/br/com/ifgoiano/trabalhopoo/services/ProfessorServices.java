package br.com.ifgoiano.trabalhopoo.services;

import br.com.ifgoiano.trabalhopoo.models.Avaliacao;
import br.com.ifgoiano.trabalhopoo.respositorys.AvaliacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessorServices {

    final AvaliacaoRepository avaliacaoRepository;

    @Autowired
    public ProfessorServices(AvaliacaoRepository avaliacaoRepository) {
        this.avaliacaoRepository = avaliacaoRepository;
    }

    public Object findAll() {
        return avaliacaoRepository.findAll();
    }
}
