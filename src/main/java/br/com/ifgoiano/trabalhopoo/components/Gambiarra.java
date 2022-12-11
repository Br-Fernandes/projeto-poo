package br.com.ifgoiano.trabalhopoo.components;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Gambiarra {

    public Gambiarra(){}

    // recebe id do usuário logado para futuras manipulações de dados
    // sem que o usuario insira parte de seus dados novamente
    private Long gambiarraTemporaria;

}
