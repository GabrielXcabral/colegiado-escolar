package com.colegiado.sistemacolegiado.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column (nullable = false)
    private String nome;
    @Column (nullable = false, unique = true)
    private String fone;
    @Column (nullable = false, unique = true)
    private String matricula;
    @Column (nullable = false, unique = true)
    private String login;
    @Column (nullable = false)
    private String senha;
}