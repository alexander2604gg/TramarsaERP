package com.alexandersaul.TramarsaERP.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor @NoArgsConstructor
@Data
@Embeddable
public class ManifiestoPuertoId implements Serializable {
    @Column(name="manifiesto_id")
    private Long manifiestoId;
    @Column(name="puerto_id")
    private Long puertoId;
}
