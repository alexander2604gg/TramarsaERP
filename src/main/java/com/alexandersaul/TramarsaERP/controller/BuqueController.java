package com.alexandersaul.TramarsaERP.controller;

import com.alexandersaul.TramarsaERP.dto.buque.CreateBuqueDTO;
import com.alexandersaul.TramarsaERP.service.IBuqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/api/buque")
public class BuqueController {

    @Autowired
    private IBuqueService buqueService;

    @PostMapping
    private ResponseEntity<Void> createBuque (@RequestBody CreateBuqueDTO createBuqueDTO){
        buqueService.createBuque(createBuqueDTO);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(null);
    }

}
