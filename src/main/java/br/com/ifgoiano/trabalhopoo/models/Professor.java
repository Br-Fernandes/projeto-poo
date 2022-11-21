package br.com.ifgoiano.trabalhopoo.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Getter
@Setter
@Table(name = "TB_PROFESSOR")
public class Professor extends Usuario {

    @Column(nullable = false, length = 30)
    private String degree;

    @Column(length = 30)
    private String masterDegree;

    @Column(length = 30)
    private String doctorateDegree;

}
