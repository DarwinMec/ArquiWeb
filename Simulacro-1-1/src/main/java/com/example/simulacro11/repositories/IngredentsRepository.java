package com.example.simulacro11.repositories;

import com.example.simulacro11.entities.Ingredents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredentsRepository extends JpaRepository<Ingredents,Integer> {
}
