package com.ferdi.demo.hayvanlar.controller;

import com.ferdi.demo.hayvanlar.controller.dto.HayvanResponseDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hayvan")
public class HayvanController {


    @GetMapping("/getirhayvan")
    public HayvanResponseDTO getirHayvan(){

        return new HayvanResponseDTO();
    }



}
