package com.desenvolve.anotacoes.service;


import com.desenvolve.anotacoes.entity.Autor;

import com.desenvolve.anotacoes.repository.AutorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class AutorService {

    @Autowired
    AutorRepository autorRepository;

    public Autor cadastraAutor(Autor autorParam){
        return autorRepository.save(autorParam);
    }

    public List<Autor> retornaAutores(){
        return autorRepository.findAll();
    }

}
