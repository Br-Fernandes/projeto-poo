package br.com.ifgoiano.trabalhopoo.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
@Table(name = "TB_PROFESSOR")
public class Professor {

    @Id
    @Column(nullable = false, length = 7)
    private int mat;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false, unique = true, length = 256)
    private String email;

    @Column(nullable = false, length = 30)
    private String degree;

    @Column(nullable = true, length = 30)
    private String masterDegree;

    @Column(nullable = true, length = 30)
    private String doctorateDegree;

}
