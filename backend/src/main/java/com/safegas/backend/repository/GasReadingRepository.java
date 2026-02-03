package com.safegas.backend.repository;

import com.safegas.backend.entity.GasReading;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GasReadingRepository extends JpaRepository<GasReading, Long> {
    // Tá pronto! O Spring já criou o findAll(), save(), etc. pra gente.
}