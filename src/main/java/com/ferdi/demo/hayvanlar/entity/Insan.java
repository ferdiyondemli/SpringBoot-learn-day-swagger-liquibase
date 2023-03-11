package com.ferdi.demo.hayvanlar.entity;

import com.ferdi.demo.hayvanlar.entity.enums.BeslenmeTur;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "insan")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Insan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "adi")
    private String adi;
    @OneToMany
    private Set<Hayvan> hayvanSet = new HashSet<>();

}
