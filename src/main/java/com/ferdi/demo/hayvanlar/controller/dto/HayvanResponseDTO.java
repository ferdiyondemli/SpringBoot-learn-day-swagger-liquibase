package com.ferdi.demo.hayvanlar.controller.dto;

import com.ferdi.demo.hayvanlar.entity.enums.BeslenmeTur;
import jakarta.persistence.Column;


public class HayvanResponseDTO {

    private Long id;
    private String adi;
    private BeslenmeTur beslenmeTur;
    private Integer yas;
    private Integer ayakSayisi;


    public HayvanResponseDTO(Long id, String adi, BeslenmeTur beslenmeTur, Integer yas, Integer ayakSayisi) {
        this.id = id;
        this.adi = adi;
        this.beslenmeTur = beslenmeTur;
        this.yas = yas;
        this.ayakSayisi = ayakSayisi;
    }

    public HayvanResponseDTO( ) {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public BeslenmeTur getBeslenmeTur() {
        return beslenmeTur;
    }

    public void setBeslenmeTur(BeslenmeTur beslenmeTur) {
        this.beslenmeTur = beslenmeTur;
    }

    public Integer getYas() {
        return yas;
    }

    public void setYas(Integer yas) {
        this.yas = yas;
    }

    public Integer getAyakSayisi() {
        return ayakSayisi;
    }

    public void setAyakSayisi(Integer ayakSayisi) {
        this.ayakSayisi = ayakSayisi;
    }
}
