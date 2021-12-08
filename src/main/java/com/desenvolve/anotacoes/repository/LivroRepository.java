package com.desenvolve.anotacoes.repository;

import com.desenvolve.anotacoes.entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Integer> {

}
