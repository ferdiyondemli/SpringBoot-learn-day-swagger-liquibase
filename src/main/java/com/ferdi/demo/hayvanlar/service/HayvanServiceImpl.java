package com.ferdi.demo.hayvanlar.service;

import com.ferdi.demo.hayvanlar.controller.dto.HayvanRequestDTO;
import com.ferdi.demo.hayvanlar.controller.dto.HayvanResponseDTO;
import com.ferdi.demo.hayvanlar.entity.Hayvan;
import com.ferdi.demo.hayvanlar.repository.HayvanRepository;
import jakarta.transaction.Transactional;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HayvanServiceImpl implements  HayvanService{

    private final HayvanRepository hayvanRepository;
    @Override
    @Transactional
    public Hayvan getirHayvan(Long id) {
        return hayvanRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Page<Hayvan> getirHayvanlar(Pageable pageRequest) {
        Page<Hayvan> hayvans=  hayvanRepository.findAll( pageRequest);
        return hayvans ;
    }

    @Override
    @Transactional
    public void ekleHayvan(Hayvan hayvan) {
        hayvanRepository.save(hayvan);
    }

    @Override
    @Transactional
    public void silHayvan(Long id) {
        hayvanRepository.deleteById(id);
    }
}
