package br.com.ifgoiano.trabalhopoo.services;

import br.com.ifgoiano.trabalhopoo.models.Avaliacao;
import br.com.ifgoiano.trabalhopoo.respositorys.AvaliacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AlunoServices {

    final AvaliacaoRepository avaliacaoRepository;

    @Autowired
    public AlunoServices(AvaliacaoRepository avaliacaoRepository) {
        this.avaliacaoRepository = avaliacaoRepository;
    }

    public ArrayList<Avaliacao> findGradeById(Long gambiarra) {
        return avaliacaoRepository.findGradeById(gambiarra);
    }
}
