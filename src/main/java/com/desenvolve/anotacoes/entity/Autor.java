package com.desenvolve.anotacoes.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "AUTORES")
public class Autor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_AUTOR", nullable = false)
    private int codigo;

    @Column(name = "PRIMEIRO_NOME_AUTOR", nullable = false)
    private String primeiroNome;

    @Column(name = "SEGUNDO_NOME_AUTOR", nullable = false)
    private String ultimoNome;
}