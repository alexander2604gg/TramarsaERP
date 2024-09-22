package com.alexandersaul.TramarsaERP.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "Carga", schema = "agenciamiento")
public class Carga {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "carga_id")
    private Long cargaId;
    @Column(length = 30)
    private String nombre;
    @Lob
    private String descripcion;
}
