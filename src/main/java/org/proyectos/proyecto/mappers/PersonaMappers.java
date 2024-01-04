/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.proyectos.proyecto.mappers;

import java.util.List;
import org.mapstruct.Mapper;
import org.proyectos.proyecto.dto.PersonaDto;
import org.proyectos.proyecto.entity.Persona;

/**
 *
 * @author campo
 */

@Mapper(componentModel = "spring")
public interface PersonaMappers {
    PersonaDto toDto(Persona persona);
    Persona toEntity(PersonaDto dto);
    List<PersonaDto>toDto(List<Persona> personas);
    List<Persona>toEntity(List<PersonaDto> personas);
}
