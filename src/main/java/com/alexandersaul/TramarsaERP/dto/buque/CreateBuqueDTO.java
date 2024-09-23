package com.alexandersaul.TramarsaERP.dto.buque;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class CreateBuqueDTO {

    @NotNull
    @Size(min = 7, max = 7, message = "El número IMO debe tener exactamente 7 dígitos")
    @Pattern(regexp = "\\d{7}", message = "El número IMO debe contener solo dígitos")
    private String imo;
    @NotNull
    private String nombre;
    @NotNull
    private String pais;
}

