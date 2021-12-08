package com.desenvolve.anotacoes.service;

import com.desenvolve.anotacoes.entity.Livro;
import com.desenvolve.anotacoes.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LivroService {

    @Autowired
    LivroRepository livroRepository;

    public Livro cadastraLivro(Livro livroParam){
        return livroRepository.save(livroParam);
    }

    public List<Livro> retornaLivros() {
        return livroRepository.findAll();
    }
}
