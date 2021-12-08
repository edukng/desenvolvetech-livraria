package com.desenvolve.anotacoes.service;

import com.desenvolve.anotacoes.entity.Autor;
import com.desenvolve.anotacoes.entity.Editora;
import com.desenvolve.anotacoes.repository.EditoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EditoraService {

    @Autowired
    EditoraRepository editoraRepository;

    public Editora cadastraEditora(Editora editoraParam) {
        return editoraRepository.save(editoraParam);
    }

    public List<Editora> retornaEditoras() {
        return editoraRepository.findAll();
    }

}
