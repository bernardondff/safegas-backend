package com.safegas.backend.repository;

import com.safegas.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

// <User, Long> significa: Esse repositório gerencia a entidade "User" e o ID dela é do tipo "Long"
public interface UserRepository extends JpaRepository<User, Long> {

    // O Spring Data JPA é tão mágico que você não precisa escrever NADA aqui.
    // Só de estender JpaRepository, ele já te dá métodos como:
    // .save(), .findAll(), .delete(), .findById()... de graça!

}