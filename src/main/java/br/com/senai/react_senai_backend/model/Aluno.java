package br.com.senai.react_senai_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Aluno {
    // Getters e Setters
    // Define a chave primária
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long matricula;
    private String nome;
    private String curso;

}
