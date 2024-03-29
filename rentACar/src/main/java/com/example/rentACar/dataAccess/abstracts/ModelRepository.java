package com.example.rentACar.dataAccess.abstracts;

import com.example.rentACar.entities.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<Model, Integer> {
}
