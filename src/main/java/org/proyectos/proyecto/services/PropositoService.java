/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.proyectos.proyecto.services;

import java.util.List;
import org.proyectos.proyecto.dto.PropositoDto;
import org.proyectos.proyecto.entity.Proposito;
import org.proyectos.proyecto.mappers.PropositoMappers;
import org.proyectos.proyecto.repository.PropositoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author campo
 */
@Service
public class PropositoService {
        @Autowired
    private PropositoRepository repository;
    @Autowired
    private PropositoMappers mapper;
    
    public List<PropositoDto> consultarProposito(){
        List<Proposito> propositos=repository.findAll();
        return mapper.toDto(propositos);
        
    }
    
    public PropositoDto guardarProposito(PropositoDto dto) {
        Proposito proposito = mapper.toEntity(dto);
        proposito = repository.save(proposito);
        return mapper.toDto(proposito);
    } 
}
