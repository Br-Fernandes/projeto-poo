package br.com.ifgoiano.trabalhopoo;

import br.com.ifgoiano.trabalhopoo.models.Coordenador;
import br.com.ifgoiano.trabalhopoo.models.Professor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@SpringBootApplication
public class TrabalhoPooApplication  {

    public static void main(String[] args) {
        SpringApplication.run(TrabalhoPooApplication.class, args);
    }



}
