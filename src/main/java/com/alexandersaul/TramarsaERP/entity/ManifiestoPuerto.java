package com.alexandersaul.TramarsaERP.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "Manifiesto_Puerto", schema = "agenciamiento")
public class ManifiestoPuerto {

    @EmbeddedId
    private ManifiestoPuertoId manifiestoPuertoId;

    @ManyToOne
    @MapsId("manifiestoId")
    @JoinColumn(name = "manifiesto_id")
    private Manifiesto manifiesto;

    @ManyToOne
    @MapsId("puertoId")
    @JoinColumn(name = "puerto_id")
    private Puerto puerto;

    @Column(length = 10)
    private String role;

}