package br.com.ifgoiano.trabalhopoo.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import java.io.Serializable;

@Embeddable
public class AvaliacaoID implements Serializable {

    private static final long serialVersionUID = -6167677257237355001L;
    private Long id;
    private String nameSubject;

}
