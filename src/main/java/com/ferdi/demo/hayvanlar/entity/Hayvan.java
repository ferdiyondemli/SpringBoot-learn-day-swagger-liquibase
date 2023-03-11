package com.ferdi.demo.hayvanlar.entity;

import com.ferdi.demo.hayvanlar.entity.enums.BeslenmeTur;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;


@Entity
@Table(name = "hayvan")
@Getter
@Setter
 public class Hayvan implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "ADI")
    private String adi;
    @Enumerated(EnumType.STRING)
    @Column(name = "beslenme_tur")
    private BeslenmeTur beslenmeTur;
    @Column(name = "yas")
    private Integer yas;
    @Column(name = "ayakSayisi")
    private Integer ayakSayisi;

}
