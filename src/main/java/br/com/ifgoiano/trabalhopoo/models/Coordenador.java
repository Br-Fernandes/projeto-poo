package br.com.ifgoiano.trabalhopoo.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "TB_COORDENADOR")
public class Coordenador extends Professor {

    @Column(nullable = false, length = 3)
    private String calvice;


}
