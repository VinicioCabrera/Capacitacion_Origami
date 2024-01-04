/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.proyectos.proyecto.mappers;

import java.util.List;
import org.mapstruct.Mapper;
import org.proyectos.proyecto.dto.ProcesoDto;
import org.proyectos.proyecto.entity.Proceso;

/**
 *
 * @author campo
 */
@Mapper(componentModel="spring")
public interface ProcesoMappers {
    Proceso toEntity(ProcesoDto dto);
    List<ProcesoDto>toDto(List<Proceso> procesos);
    List<Proceso>toEntity(List<ProcesoDto> procesos);
}
