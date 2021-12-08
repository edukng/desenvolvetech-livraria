package com.desenvolve.anotacoes.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "LIVROS")
public class Livro implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_LIVRO", nullable = false)
    private int codigo;

    @Column(name = "TITULO_LIVRO", nullable = false)
    private String titulo;

    @Column(name = "ANO_LIVRO", nullable = false)
    private int ano;

    @ManyToOne
    private Editora editora;

    @ManyToMany
    @Column(nullable = false)
    private List<Autor> autores;

}

