package br.com.senai.react_senai_backend.service;

import br.com.senai.react_senai_backend.model.Aluno;
import br.com.senai.react_senai_backend.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    private final AlunoRepository repository;
    public AlunoService(AlunoRepository repository) {
        this.repository = repository;
    }
    // Lista todos os alunos
    public List<Aluno> listar() {
        return repository.findAll();
    }
    // Salva aluno
    public Aluno salvar(Aluno aluno) {
        return repository.save(aluno);
    }
    // Exclui aluno
    public void excluir(Long id) {
        repository.deleteById(id);
    }
}
