package com.desenvolve.anotacoes.repository;

import com.desenvolve.anotacoes.entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AutorRepository extends JpaRepository<Autor, Integer> {
}
