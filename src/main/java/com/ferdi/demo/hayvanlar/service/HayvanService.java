package com.ferdi.demo.hayvanlar.service;

import com.ferdi.demo.hayvanlar.controller.dto.HayvanRequestDTO;
import com.ferdi.demo.hayvanlar.controller.dto.HayvanResponseDTO;
import com.ferdi.demo.hayvanlar.entity.Hayvan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface HayvanService {

    Hayvan getirHayvan(Long id);

    Page<Hayvan> getirHayvanlar(Pageable pageRequest);

    void ekleHayvan(Hayvan hayvan);

    void silHayvan(Long id);
}
