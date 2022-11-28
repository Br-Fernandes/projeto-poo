package br.com.ifgoiano.trabalhopoo.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "TB_DISCIPLINA")
public class Disciplina {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, unique = true, length = 35)
    private String subjectName;

    @Column(nullable = false)
    private String nameProfessor;

    @Column(nullable = false)
    private Integer semester;

    @Column()
    private String description;

}
