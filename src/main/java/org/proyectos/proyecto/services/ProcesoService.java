/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.proyectos.proyecto.services;

import java.util.List;
import org.proyectos.proyecto.dto.ProcesoDto;
import org.proyectos.proyecto.entity.Proceso;
import org.proyectos.proyecto.mappers.ProcesoMappers;
import org.proyectos.proyecto.repository.ProcesoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author campo
 */
@Service
public class ProcesoService {
    @Autowired
    private ProcesoRepository repository;
    @Autowired
    private ProcesoMappers procesoMapper;
    
    public List<ProcesoDto> consultarProcesos(){
        List<Proceso> Proceso=repository.findAll();
        List<ProcesoDto> procesosDtos=procesoMapper.toDto(Proceso);
 
        return procesosDtos;
    
    }   
}
