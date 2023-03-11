package com.ferdi.demo.hayvanlar.controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ferdi.demo.hayvanlar.controller.dto.HayvanRequestDTO;
import com.ferdi.demo.hayvanlar.controller.dto.HayvanResponseDTO;
import com.ferdi.demo.hayvanlar.entity.Hayvan;
import com.ferdi.demo.hayvanlar.mapper.HayvanMapper;
import com.ferdi.demo.hayvanlar.service.HayvanService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hayvan")
@RequiredArgsConstructor
public class HayvanController {

    private final HayvanService hayvanService;


    @GetMapping("/getirhayvan")
    public HayvanResponseDTO hayvan(@RequestParam Long id) {
        return HayvanMapper.INSTANCE.hayvanToDTO(hayvanService.getirHayvan(id));
    }

    @PostMapping("/getirhayvanlar")
    @JsonIgnoreProperties(ignoreUnknown = true)
    public Page<Hayvan> hayvan(@RequestParam int page, @RequestParam int size) {
         // PageRequest pageable=PageRequest.of(pageRequest.getPageNumber(), pageRequest.getPageSize(), Sort.Direction.ASC);
Pageable pageable=PageRequest.of(page,size);

        return  hayvanService.getirHayvanlar(pageable);
    }

    @PostMapping("/eklehayvan")
    public void hayvan(@RequestBody HayvanRequestDTO hayvanRequestDTO) {

        Hayvan hayvan= HayvanMapper.INSTANCE.toHayvan(hayvanRequestDTO);
        hayvanService.ekleHayvan(hayvan);
    }

    @DeleteMapping("/silhayvan")
    public void hayvanSil(@RequestParam() Long id) {

        hayvanService.silHayvan(id);
    }


}
