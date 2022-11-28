package br.com.ifgoiano.trabalhopoo.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Getter
@Setter
public class Usuario implements Serializable {

    @Id
    @Column(nullable = false, unique = true, length = 7)
    private Long idUser;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false, unique = true, length = 256)
    private String email;

}
