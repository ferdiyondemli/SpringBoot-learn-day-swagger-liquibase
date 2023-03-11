package com.ferdi.demo.hayvanlar.mapper;


import com.ferdi.demo.hayvanlar.controller.dto.HayvanRequestDTO;
import com.ferdi.demo.hayvanlar.controller.dto.HayvanResponseDTO;
import com.ferdi.demo.hayvanlar.entity.Hayvan;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface HayvanMapper {

    HayvanMapper INSTANCE = Mappers.getMapper(HayvanMapper.class);

    HayvanResponseDTO hayvanToDTO(Hayvan hayvan);

    Hayvan toHayvan(HayvanRequestDTO hayvanRequestDTO);




}
