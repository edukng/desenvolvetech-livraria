package com.desenvolve.anotacoes.controller;

import com.desenvolve.anotacoes.entity.Autor;
import com.desenvolve.anotacoes.entity.Editora;
import com.desenvolve.anotacoes.service.EditoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/editoras")
public class EditoraController {

    @Autowired
    EditoraService editoraService;

    @PostMapping("/cadastro")
    public ResponseEntity<Editora> postEditora(@RequestBody Editora editoraParam) {
        return new ResponseEntity<>(editoraService.cadastraEditora(editoraParam), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Editora> getEditora() {
        return editoraService.retornaEditoras();
    }
}
