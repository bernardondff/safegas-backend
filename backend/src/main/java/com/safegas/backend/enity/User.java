package com.safegas.backend.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data // O Lombok cria automaticamente os Getters, Setters e toString pra gente!
@Entity // Isso avisa pro Spring: "Transforme essa classe numa tabela no banco"
@Table(name = "tb_users") // Nome que a tabela terá no Postgres
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // O banco gera o ID (1, 2, 3...) sozinho
    private Long id;

    private String name;

    @Column(unique = true) // Não deixa cadastrar dois emails iguais
    private String email;

    private String password;
}