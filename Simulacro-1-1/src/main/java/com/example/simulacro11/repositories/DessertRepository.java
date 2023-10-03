package com.example.simulacro11.repositories;

import com.example.simulacro11.entities.Dessert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DessertRepository extends JpaRepository<Dessert,Integer> {
    @Query(value = "SELECT p.name_dessert AS nombre_postre, COUNT(i.id_ingredient) AS cantidad_ingredientes, p.difficulty_dessert AS dificultad_postre  " +
            "FROM desserts p " +
            "JOIN ingredents i ON p.id_dessert = i.id_dessert " +
            "GROUP BY p.name_dessert, p.difficulty_dessert " +
            "ORDER BY p.difficulty_dessert",
            nativeQuery = true)
    List<Object[]> ListarPostrEingr();
}
