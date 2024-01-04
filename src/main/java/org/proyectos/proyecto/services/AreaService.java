/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.proyectos.proyecto.services;

import java.util.List;
import org.proyectos.proyecto.dto.AreaDto;
import org.proyectos.proyecto.entity.Area;
import org.proyectos.proyecto.mappers.AreaMappers;
import org.proyectos.proyecto.repository.AreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author campo
 */
@Service
public class AreaService {
  @Autowired
    private AreaRepository repository;
    @Autowired
    private AreaMappers areaMapper;
    
    public List<AreaDto> consultarAreas(){
        List<Area> area=repository.findAll();
        List<AreaDto> areasDtos=areaMapper.toDto(area);
        /*for(Area a: areas){
            AreaDto dto=new AreaDto();
            dto.setId(a.getId());
            dto.setDescripcion(a.getDescripcion());
            areasDtos.add(dto);
           
    }*/
        return areasDtos;
    
    }  
}
