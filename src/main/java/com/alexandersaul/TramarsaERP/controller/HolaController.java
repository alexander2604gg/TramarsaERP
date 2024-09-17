package com.alexandersaul.TramarsaERP.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

    @GetMapping("/hola")
    public ResponseEntity<?> hola (){
        return ResponseEntity.ok("Hola");
    }

}
