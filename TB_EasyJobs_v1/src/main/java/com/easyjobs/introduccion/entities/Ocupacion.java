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
@Table(name = "Ocupacion")
public class Ocupacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_ocupacion;
    @Column(name = "nombreOcupacion", length = 60, nullable = false)
    private String nombreOcupacion;
    @Column(name = "descripcionOcupacion", length = 120, nullable = false)
    private String descripcionOcupacion;

}