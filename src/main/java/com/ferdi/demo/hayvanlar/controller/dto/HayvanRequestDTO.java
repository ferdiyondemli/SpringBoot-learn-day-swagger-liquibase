package com.ferdi.demo.hayvanlar.controller.dto;

import com.ferdi.demo.hayvanlar.entity.enums.BeslenmeTur;
import io.swagger.v3.oas.annotations.Parameter;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HayvanRequestDTO {


    @Parameter(example = "kedi")
    private String adi;
    private BeslenmeTur beslenmeTur;
    @Parameter(example = "5", required = true)
    private Integer yas;
    private Integer ayakSayisi;



}
