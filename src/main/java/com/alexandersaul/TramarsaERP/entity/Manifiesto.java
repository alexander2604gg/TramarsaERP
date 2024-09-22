package com.alexandersaul.TramarsaERP.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "Manifiesto", schema = "agenciamiento")
public class Manifiesto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "manifiesto_id")
    private Long manifiestoId;
    @Column(name = "num_viaje")
    private int numViaje;
    @Column(name = "fecha_zarpe")
    private LocalDateTime fechaZarpe;
    @Column(name = "num_bl")
    private int numBl;
    @Column(name = "marca", length = 10)
    private String marca;
    @Column(name = "to_order")
    private boolean toOrder;
    @Column(name = "peso_bruto", length = 18)
    private BigDecimal pesoBruto;
    @Column(name = "unidad_medida", length = 3)
    private String unidadMedida;
    @Column(name = "precio", length = 18)
    private BigDecimal precio;
    @ManyToOne
    @JoinColumn(name = "carga_id", nullable = false)
    private Carga carga;
    @ManyToOne
    @JoinColumn(name = "imo", nullable = false)
    private Buque buque;
    @ManyToOne
    @JoinColumn(name = "consignatario_id", nullable = false)
    private Consignatario consignatario;
    @ManyToOne
    @JoinColumn(name = "embarcador_id", nullable = false)
    private Embarcador embarcador;

}