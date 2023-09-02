package com.easyjobs.introduccion.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
    @Entity
    @Table(name = "Trabajador")
    public class Trabajador {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(name = "nombreTrabajador", length = 60, nullable = false)
        private String nombreTrabajador;
        @Column(name = "residenciaTrabajador", length = 60, nullable = false)
        private String residenciaTrabajador;
        @Column(name = "celularTrabajador", length = 60, nullable = false)
        private int celularTrabajador;
        @Column(name = "emailTrabajador", length = 35)
        private String emailTrabajador;
    }


