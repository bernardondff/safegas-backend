package com.safegas.backend.controller;

import com.safegas.backend.entity.GasReading;
import com.safegas.backend.repository.GasReadingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/readings") // A rota será: localhost:8080/readings
@CrossOrigin(origins = "*") // LIBERA O ACESSO PRO SITE
public class GasReadingController {

    @Autowired
    private GasReadingRepository repository;

    // 1. Rota pro Site PEGAR o histórico (GET)
    @GetMapping
    public List<GasReading> getReadings() {
        return repository.findAll();
    }

    // 2. Rota pro ESP32/Site SALVAR um dado novo (POST)
    @PostMapping
    public GasReading saveReading(@RequestBody GasReading reading) {
        // Se não mandar a hora, a gente grava a hora de agora (Server Time)
        if (reading.getTimestamp() == null) {
            reading.setTimestamp(LocalDateTime.now());
        }
        return repository.save(reading);
    }
}