package com.desenvolve.anotacoes.controller;

import com.desenvolve.anotacoes.entity.Editora;
import com.desenvolve.anotacoes.entity.Livro;
import com.desenvolve.anotacoes.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    LivroService livroService;

    @PostMapping("/cadastro")
    public ResponseEntity<Livro> postLivro(@RequestBody Livro livroParam) {
        return new ResponseEntity<>(livroService.cadastraLivro(livroParam), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Livro> getLivro() {
        return livroService.retornaLivros();
    }
}
