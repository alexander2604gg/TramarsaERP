package com.alexandersaul.TramarsaERP.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity @Data
@Table(name = "Consignatario", schema = "agenciamiento")
public class Consignatario {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "consignatario_id")
    private Long consignatarioId;

    @Column(length = 25)
    private String nombre;

    @Column(length = 50)
    private String direccion;

    @Column(length = 18)
    private String pais;
}