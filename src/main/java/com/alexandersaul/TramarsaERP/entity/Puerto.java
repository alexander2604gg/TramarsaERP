package com.alexandersaul.TramarsaERP.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "Puerto", schema = "agenciamiento")
public class Puerto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "puerto_id")
    private Long puertoId;
    @Column(name = "ciudad", length = 40)
    private String ciudad;
    @Column(name = "pais", length = 18)
    private String pais;

}