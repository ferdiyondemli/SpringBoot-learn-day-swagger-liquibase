package com.ferdi.demo.hayvanlar.controller;

import com.ferdi.demo.hayvanlar.controller.dto.HayvanResponseDTO;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hayvan")
public class HayvanController {


    @GetMapping("/getirhayvan")
    @Operation(description = "Hayvan Bilgisini Getirir.")
    public HayvanResponseDTO getirHayvan(){

        return new HayvanResponseDTO();
    }



}
