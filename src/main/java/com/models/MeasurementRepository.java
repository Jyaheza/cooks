package com.example.cookingrecipe.repository;

import com.example.cookingrecipe.model.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeasurementRepository extends JpaRepository<Measurement, Long> {
}
