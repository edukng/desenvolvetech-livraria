package com.desenvolve.anotacoes.controller;

import com.desenvolve.anotacoes.entity.Autor;
import com.desenvolve.anotacoes.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autores")
public class AutorController {

    @Autowired
    AutorService autorService;

    @PostMapping("/cadastro")
    public ResponseEntity<Autor> postAutor(@RequestBody Autor autorParam) {
        return new ResponseEntity<>(autorService.cadastraAutor(autorParam), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Autor> getAutor() {
        return autorService.retornaAutores();
    }
}
