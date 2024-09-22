package com.alexandersaul.TramarsaERP.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class ResponseDTO {
    private String statusCode;
    private String statusMessage;
}
