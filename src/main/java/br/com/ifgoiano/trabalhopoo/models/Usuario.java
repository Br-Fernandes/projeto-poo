package br.com.ifgoiano.trabalhopoo.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
public class Usuario {

    @Id
    @Column(nullable = false, unique = true, length = 7)
    private int mat;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false, unique = true, length = 256)
    private String email;

}
