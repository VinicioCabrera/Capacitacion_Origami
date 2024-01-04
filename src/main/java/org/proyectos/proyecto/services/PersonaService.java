/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.proyectos.proyecto.services;

import java.util.List;
import org.proyectos.proyecto.dto.PersonaDto;
import org.proyectos.proyecto.entity.Persona;
import org.proyectos.proyecto.mappers.PersonaMappers;
import org.proyectos.proyecto.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author campo
 */
@Service
public class PersonaService {
    
    @Autowired
    private PersonaRepository repository;
      @Autowired
    private PersonaMappers personaMapper;
    
    public List<PersonaDto> consultarPersonas(){
        List<Persona> persona=repository.findAll();
        List<PersonaDto> personasDtos=personaMapper.toDto(persona);
        return personasDtos;
    
    }  
}
