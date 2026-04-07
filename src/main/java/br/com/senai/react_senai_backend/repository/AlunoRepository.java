package br.com.senai.react_senai_backend.repository;

import br.com.senai.react_senai_backend.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
