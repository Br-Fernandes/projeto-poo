package br.com.ifgoiano.trabalhopoo.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="TB_ALUNO")
public class Aluno extends Usuario {

    @Column(nullable = false, length = 50)
    private String motherName;

    @Column(length = 50)
    private String fatherName;

}
