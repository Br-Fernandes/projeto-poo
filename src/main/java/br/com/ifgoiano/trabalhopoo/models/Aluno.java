package br.com.ifgoiano.trabalhopoo.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="TB_ALUNO")
public class Aluno {

    @Id
    @Column(nullable = false, length = 7)
    private int mat;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false, unique = true, length = 256)
    private String email;

    @Column(length = 9)
    private String phoneNumber;


}
