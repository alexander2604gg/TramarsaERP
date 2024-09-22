package com.alexandersaul.TramarsaERP.controller;

import com.alexandersaul.TramarsaERP.constants.ResponseConstants;
import com.alexandersaul.TramarsaERP.dto.buque.CreateBuqueDTO;
import com.alexandersaul.TramarsaERP.dto.buque.ResponseBuqueDTO;
import com.alexandersaul.TramarsaERP.dto.response.ResponseDTO;
import com.alexandersaul.TramarsaERP.service.IBuqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/api/buque")
public class BuqueController {

    @Autowired
    private IBuqueService buqueService;

    @GetMapping
    public ResponseEntity<List<ResponseBuqueDTO>> getAll () {
        List<ResponseBuqueDTO> responseBuqueDTOList = buqueService.getAllBuques();
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(responseBuqueDTOList);
    }

    @PostMapping
    public ResponseEntity<ResponseDTO> createBuque (@RequestBody CreateBuqueDTO createBuqueDTO){
        buqueService.createBuque(createBuqueDTO);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ResponseDTO(ResponseConstants.STATUS_201 , ResponseConstants.MESSAGE_201));
    }

}
