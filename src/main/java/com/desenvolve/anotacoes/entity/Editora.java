package com.desenvolve.anotacoes.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

// Editora 1<->0 Livro 0X->0 Autor

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "EDITORAS")
public class Editora implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_EDITORA", nullable = false)
    private int codigo;

    @Column(name = "NOME_EDITORA", nullable = false)
    private String nome;

    @OneToMany(mappedBy = "editora", cascade = CascadeType.ALL)
    @Column(nullable = false)
    private List<Livro> livros;
}
