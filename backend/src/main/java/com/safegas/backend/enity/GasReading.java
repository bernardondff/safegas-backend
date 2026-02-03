package com.safegas.backend.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "tb_gas_readings")
public class GasReading {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double level; // O nível de gás que vai aparecer no gráfico do site

    private LocalDateTime timestamp; // A hora que aconteceu
}