package com.alexandersaul.TramarsaERP.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "Embarcador", schema = "agenciamiento")
public class Embarcador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "embarcador_id")
    private Long embarcadorId;

    @Column(length = 25)
    private String nombre;

    @Column(length = 50)
    private String direccion;

    @Column(length = 18)
    private String pais;
}