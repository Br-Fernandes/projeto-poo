package br.com.ifgoiano.trabalhopoo.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "TB_AVALIACAO")
public class Avaliacao {

    @EmbeddedId
    private AvaliacaoID id;

    @Column(nullable = false)
    private Double grade;

}
