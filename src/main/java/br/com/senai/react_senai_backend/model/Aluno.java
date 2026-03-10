package br.com.senai.react_senai_backend.model;

public class Aluno {
    private int matricula;
    private String nome;
    private String curso;
    public Aluno(int matricula, String nome, String curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
    }
    public int getMatricula() {
        return matricula;
    }
    public String getNome() {
        return nome;
    }
    public String getCurso() {
        return curso;
    }
}
