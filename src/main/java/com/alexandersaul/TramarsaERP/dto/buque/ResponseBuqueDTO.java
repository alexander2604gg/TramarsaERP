package com.alexandersaul.TramarsaERP.dto.buque;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class ResponseBuqueDTO {
    private String imo;
    private String nombre;
    private String pais;
}
