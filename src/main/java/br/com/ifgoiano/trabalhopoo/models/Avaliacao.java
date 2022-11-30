package br.com.ifgoiano.trabalhopoo.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "TB_AVALIACAO")
public class Avaliacao {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private String subjectName;

    @Column(nullable = false)
    private Long idStudent;

    @Column(nullable = false)
    private Double grade;

}
