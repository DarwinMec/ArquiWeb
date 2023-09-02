package com.easyjobs.introduccion.repositories;

import com.easyjobs.introduccion.entities.Trabajador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrabajadorRepository extends JpaRepository<Trabajador,Long> {
}
