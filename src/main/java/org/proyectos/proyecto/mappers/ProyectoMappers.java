/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.proyectos.proyecto.mappers;

import java.util.List;
import org.mapstruct.Mapper;
import org.proyectos.proyecto.dto.ProyectoDto;
import org.proyectos.proyecto.entity.Proyecto;

/**
 *
 * @author campo
 */

@Mapper(componentModel = "spring", uses = {AreaMappers.class, PersonaMappers.class, ProcesoMappers.class})

public interface ProyectoMappers {
    ProyectoDto toDto(Proyecto proyecto);
    Proyecto toEntity(ProyectoDto dto);
    List<ProyectoDto> toDto(List<Proyecto> proyectos);
    List<Proyecto> toEntity(List<ProyectoDto> proyectos);
    
}
