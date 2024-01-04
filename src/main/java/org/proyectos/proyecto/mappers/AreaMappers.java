/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.proyectos.proyecto.mappers;

import java.util.List;
import org.mapstruct.Mapper;
import org.proyectos.proyecto.dto.AreaDto;
import org.proyectos.proyecto.entity.Area;

/**
 *
 * @author campo
 */

@Mapper(componentModel= "spring")
public interface AreaMappers {
    
    AreaDto toDto(Area area);
    Area toEntity(AreaDto dto);
    List<AreaDto>toDto(List<Area> areas);
    List<Area>toEntity(List<AreaDto> areas);
    
    
}
