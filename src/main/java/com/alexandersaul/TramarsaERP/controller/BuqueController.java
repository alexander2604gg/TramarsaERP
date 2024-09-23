package com.alexandersaul.TramarsaERP.controller;

import com.alexandersaul.TramarsaERP.constants.ResponseConstants;
import com.alexandersaul.TramarsaERP.dto.buque.CreateBuqueDTO;
import com.alexandersaul.TramarsaERP.dto.buque.ResponseBuqueDTO;
import com.alexandersaul.TramarsaERP.dto.response.ResponseDTO;
import com.alexandersaul.TramarsaERP.service.IBuqueService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/api/buque")
@Validated
public class BuqueController {

    @Autowired
    private IBuqueService buqueService;

    @GetMapping("/findAll")
    public ResponseEntity<List<ResponseBuqueDTO>> getAll () {
        List<ResponseBuqueDTO> responseBuqueDTOList = buqueService.getAllBuques();
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(responseBuqueDTOList);
    }

    @GetMapping("/findByImo/{imo}")
    public ResponseEntity<ResponseBuqueDTO> getByImo (@PathVariable @Pattern(regexp = "\\d{7}",
                                                message = "El número IMO debe tener exactamente 7 dígitos") String imo){
        ResponseBuqueDTO responseBuqueDTO = buqueService.findByImo(imo);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(responseBuqueDTO);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> createBuque (@RequestBody @Valid CreateBuqueDTO createBuqueDTO){
        buqueService.createBuque(createBuqueDTO);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ResponseDTO(ResponseConstants.STATUS_201 , ResponseConstants.MESSAGE_201));
    }

}
