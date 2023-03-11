package com.ferdi.demo.hayvanlar.controller.dto;

import com.ferdi.demo.hayvanlar.entity.enums.BeslenmeTur;
import jakarta.persistence.Column;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HayvanResponseDTO {

    private Long id;
    private String adi;
    private BeslenmeTur beslenmeTur;
    private Integer yas;
    private Integer ayakSayisi;

}
