package com.desenvolve.anotacoes.repository;

import com.desenvolve.anotacoes.entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

interface LivroRepository extends JpaRepository<Livro, Integer> {
}
