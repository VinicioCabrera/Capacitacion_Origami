/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.proyectos.proyecto.resource;

import org.proyectos.proyecto.services.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author campo
 */
@RestController
public class AreaResource {
    @Autowired//inyectar
    private AreaService service;
            
    @RequestMapping(value = "consultarArea", method = RequestMethod.GET)
    public ResponseEntity<?> consultarArea() {
        return new ResponseEntity<>(service.consultarAreas(), HttpStatus.OK);
}
}
