package com.alexandersaul.TramarsaERP.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor
@Entity @Data
@Table(name = "Buque" , schema = "agenciamiento")
public class Buque {
    @Id
    @Column(name = "imo", length = 9, nullable = false)
    private String imo;
    @Column(length = 50 )
    private String nombre;
    @Column(length = 18)
    private String pais;
}
