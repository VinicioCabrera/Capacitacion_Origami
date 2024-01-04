/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.proyectos.proyecto.mappers;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.proyectos.proyecto.dto.PropositoDto;
import org.proyectos.proyecto.entity.Proposito;

/**
 *
 * @author campo
 */
@Mapper(componentModel = "spring")
public interface PropositoMappers {
    @Mapping(target= "objetivoId",source="Proposito.proyecto.id")
    PropositoDto toDto(Proposito Proposito);
    @Mapping(target= "proyecto.id",source="dto.objetivoId")
    Proposito toEntity(PropositoDto dto);
    List<PropositoDto> toDto(List<Proposito> Propositos);
    List<Proposito> toEntity(List<PropositoDto> Propositos);
}
