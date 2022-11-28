package br.com.ifgoiano.trabalhopoo.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "TB_PROFESSOR_DISCIPLINA")
public class ProfessoresDisciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, unique = false, length = 35)
    private String subjectName;

    @Column(nullable = false, unique = false, length = 7)
    private Long idProfessor;

}
