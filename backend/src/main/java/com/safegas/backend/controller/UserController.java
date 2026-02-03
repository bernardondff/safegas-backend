package com.safegas.backend.controller;

import com.safegas.backend.entity.User;
import com.safegas.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Diz pro Spring: "Isso aqui é uma API REST"
@RequestMapping("/users") // Todas as rotas aqui vão começar com /users
public class UserController {

    @Autowired // O Spring injeta o "Gerente do Banco" aqui sozinho
    private UserRepository repository;

    // Rota 1: Cadastrar Usuário (POST)
    // Endereço: POST http://localhost:8080/users
    @PostMapping
    public User createUser(@RequestBody User user) {
        return repository.save(user); // Salva no banco e retorna o usuário criado
    }

    // Rota 2: Listar todo mundo (GET)
    // Endereço: GET http://localhost:8080/users
    @GetMapping
    public List<User> listAll() {
        return repository.findAll(); // Busca todo mundo no banco
    }
}